package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.entity.User;
import itacademy.project.model.CabinetModel;
import itacademy.project.repository.CabinetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CabinetServiceImpl implements CabinetService {
    @Autowired
    private CabinetRepository cabinetRepository;
    @Autowired
    private UserService userService;

    @Override
    public List<Cabinet> getAllCabinet() {
        return cabinetRepository.findAll();
    }

    @Override
    public Cabinet save(CabinetModel cabinetModel) {
        User teacher = userService.getUserById(cabinetModel.getTeacherId());

        Cabinet cabinet = Cabinet.builder()
                .name(cabinetModel.getName())
                .description(cabinetModel.getDescription())
                .teacher(teacher).build();
        return cabinetRepository.save(cabinet);
    }

    @Override
    public Cabinet getCabinetById(Long id) {
        return cabinetRepository.findById(id).orElse(null);
    }

    @Override
    public Cabinet deleteCabinetById(Long id) {
        Cabinet cabinet = getCabinetById(id);
        if (cabinet != null){
            cabinetRepository.delete(cabinet);
            return cabinet;
        }
        return null;
    }
}
