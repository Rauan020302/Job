package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.repository.CabinetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CabinetServiceImpl implements CabinetService {
    @Autowired
    private CabinetRepository cabinetRepository;

    @Override
    public List<Cabinet> getAllCabinet() {
        return cabinetRepository.findAll();
    }

    @Override
    public Cabinet save(Cabinet cabinet) {
        return cabinetRepository.save(cabinet);
    }

    @Override
    public Cabinet getCabinetById(Long id) {
        return cabinetRepository.findById(id).orElse(null);
    }
}
