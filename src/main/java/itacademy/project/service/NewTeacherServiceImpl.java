package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.entity.User;
import itacademy.project.entity.UserRole;
import itacademy.project.model.TeacherModel;
import itacademy.project.repository.NewTeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class NewTeacherServiceImpl implements NewTeacherService {
    @Autowired
    private NewTeacherRepository newTeacherRepository;
//    @Autowired
//    private CabinetService cabinetService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> getAllTeachers() {
        return newTeacherRepository.findAll();
    }

    @Override
    public User save(TeacherModel teacherModel) {
        User user = User.builder()
                .password(teacherModel.getPassword())
                .username(teacherModel.getUsername())
                .status(teacherModel.getStatus())
                .name(teacherModel.getName())
                .age(teacherModel.getAge())
                .gender(teacherModel.getGender())
                .profession(teacherModel.getProfession())
                .createdDate(LocalDateTime.now())
                .build();
        if (user.getUsername().equals("") || user.getPassword().equals("") || user.getUsername() == null || user.getPassword() == null){
            return null;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        newTeacherRepository.save(user);
        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_TEACHER");
        userRole.setUser(user);
        userRoleService.save(userRole);
        return user;
    }

    @Override
    public User getTeacherById(Long id) {
        return newTeacherRepository.findById(id).orElse(null);
    }

    @Override
    public User deleteTeacherById(Long id) {
        User user = getTeacherById(id);
        if (user != null){
            newTeacherRepository.delete(user);
            return user;
        }
        return null;
    }
}
