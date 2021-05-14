package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.model.CabinetModel;

import java.util.List;

public interface CabinetService {
    List<Cabinet> getAllCabinet();
    Cabinet save(CabinetModel cabinetModel);
    Cabinet getCabinetById(Long id);
    Cabinet deleteCabinetById(Long id);
}
