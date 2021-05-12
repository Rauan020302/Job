package itacademy.project.controller;

import itacademy.project.entity.User;
import itacademy.project.model.AuthModel;
import itacademy.project.model.StudentModel;
import itacademy.project.model.TeacherModel;
import itacademy.project.service.NewStudentService;
import itacademy.project.service.NewTeacherService;
import itacademy.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private NewStudentService newStudentService;
    @Autowired
    private NewTeacherService newTeacherService;

    @PostMapping("/sign-up")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @PostMapping("/sign-up/student")
    public User save(@RequestBody StudentModel studentModel){
        return newStudentService.save(studentModel);
    }
    @PostMapping("/sign-up/teacher")
    public User save(@RequestBody TeacherModel teacherModel ){
        return newTeacherService.save(teacherModel);
    }
    @PostMapping("sign-in")
    public String getToken(@RequestBody AuthModel authModel){
        return userService.getTokenByAuthModel(authModel);
    }
}
