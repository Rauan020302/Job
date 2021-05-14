package itacademy.project.service;

import itacademy.project.entity.User;
import itacademy.project.entity.UserRole;
import itacademy.project.model.UserRoleModel;
import itacademy.project.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private UserService userService;
    @Override
    public UserRole save(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole save(UserRoleModel userRoleModel)throws IllegalAccessException  {
        UserRole userRole = new UserRole();
        userRole.setRoleName(userRoleModel.getRoleName());
        User user = userService.getUserById(userRoleModel.getUserId());
        if (user == null)throw new IllegalAccessException("Пользователь с ID " + userRoleModel.getUserId() + " не найден");
        userRole.setUser(user);
    return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole getUserRoleById(Long id) {
        return userRoleRepository.findById(id).orElse(null);
    }

    @Override
    public UserRole deleteUserRole(Long id) {
        UserRole userRole = getUserRoleById(id);
        if (userRole != null){
            userRoleRepository.delete(userRole);
            return userRole;
        }
        return null;
    }
}
