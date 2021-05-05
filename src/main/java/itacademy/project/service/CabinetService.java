package itacademy.project.service;

import itacademy.project.entity.Cabinet;

import java.util.List;

public interface CabinetService {
    List<Cabinet> getAllCabinet();
    Cabinet save(Cabinet cabinet);
    Cabinet getCabinetById(Long id);
    Cabinet deleteCabinetById(Long id);
}
