package itacademy.project.controller;

import itacademy.project.entity.UserRole;
import itacademy.project.model.UserRoleModel;
import itacademy.project.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user_role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public UserRole save (@RequestBody UserRoleModel userRoleModel)throws IllegalAccessException{
        return userRoleService.save(userRoleModel);
    }
    @DeleteMapping("/{userRoleId}")
    public UserRole deleteUserRole(@PathVariable Long userRoleId){
        return userRoleService.deleteUserRole(userRoleId);
    }

}
