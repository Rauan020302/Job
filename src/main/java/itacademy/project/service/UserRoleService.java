package itacademy.project.service;

import itacademy.project.entity.UserRole;
import itacademy.project.model.UserRoleModel;

public interface UserRoleService {
    UserRole save(UserRole userRole);
    UserRole save(UserRoleModel userRoleModel) throws IllegalAccessException;
    UserRole getUserRoleById(Long id);
    UserRole deleteUserRole(Long id);
}
