package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.entity.User;
import itacademy.project.entity.UserRole;
import itacademy.project.model.StudentModel;
import itacademy.project.repository.NewStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class NewStudentServiceImpl implements NewStudentService {
    @Autowired
    private NewStudentRepository newStudentRepository;
    @Autowired
    private UserRoleService userRoleService;
//    @Autowired
//    private CabinetService cabinetService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public List<User> getAllStudents() {
        return newStudentRepository.findAll();
    }

    @Override
    public User save(StudentModel studentModel) {
       // Cabinet cabinet = cabinetService.getCabinetById(studentModel.getCabinetId());
       // if (cabinet == null )return null;
        User user = User.builder()
                .password(studentModel.getPassword())
                .username(studentModel.getUsername())
                .status(studentModel.getStatus())
                .name(studentModel.getName())
                .age(studentModel.getAge())
                //.cabinet(cabinet)
                .gender(studentModel.getGender())
                .createdDate(LocalDateTime.now())
                .build();
        if (user.getUsername().equals("") || user.getPassword().equals("") || user.getUsername() == null || user.getPassword() == null){
            return null;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        newStudentRepository.save(user);
        UserRole userRole = new UserRole();
        userRole.setRoleName("ROLE_STUDENT");
        userRole.setUser(user);
        userRoleService.save(userRole);
        return user;

    }

    @Override
    public User getStudentById(Long id) {
        return newStudentRepository.findById(id).orElse(null);
    }

    @Override
    public User deleteStudentById(Long id) {
        User user = getStudentById(id);
        if (user != null){
            newStudentRepository.delete(user);
            return user;
        }
        return null;

    }
}
