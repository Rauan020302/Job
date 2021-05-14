package itacademy.project.controller;

import itacademy.project.entity.Cabinet;
import itacademy.project.model.CabinetModel;
import itacademy.project.service.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/cabinet")
public class CabinetController {
    @Autowired
    private CabinetService cabinetService;

    @GetMapping
    public List<Cabinet> getAllCabinet(){
        return cabinetService.getAllCabinet();
    }
    @PostMapping
    public Cabinet save(@RequestBody CabinetModel cabinetModel){
        return cabinetService.save(cabinetModel);
    }
    @GetMapping("/{cabinetId}")
    public Cabinet getCabinetById(@PathVariable Long cabinetId){
        return cabinetService.getCabinetById(cabinetId);
    }
    @DeleteMapping("/{cabinetId}")
    public Cabinet deleteCabinetById(@PathVariable Long cabinetId){
        return cabinetService.deleteCabinetById(cabinetId);
    }
}
