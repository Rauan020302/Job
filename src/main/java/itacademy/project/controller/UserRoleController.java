package itacademy.project.controller;

import itacademy.project.entity.UserRole;
import itacademy.project.model.UserRoleModel;
import itacademy.project.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user_role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public UserRole save (@RequestBody UserRoleModel userRoleModel)throws IllegalAccessException{
        return userRoleService.save(userRoleModel);
    }
}
