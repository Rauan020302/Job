package itacademy.project.service;

import itacademy.project.entity.Cabinet;
import itacademy.project.entity.Teacher;
import itacademy.project.entity.User;
import itacademy.project.model.TeacherModel;
import itacademy.project.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service
public class TeacherServiceImpl implements TeacherService {
//    @Autowired
//    private TeacherRepository teacherRepository;
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private CabinetService cabinetService;
//
//    @Override
//    public List<Teacher> getAllTeachers() {
//        return teacherRepository.findAll();
//    }
//
//    @Override
//    public Teacher save(TeacherModel teacherModel) {
//        User user = userService.getUserById(teacherModel.getUserId());
//        Cabinet cabinet = cabinetService.getCabinetById(teacherModel.getCabinetId());
//        //if (user == null || cabinet == null) return null;
//        Teacher teacher = Teacher.builder()
//                .name(teacherModel.getName())
//                .age(teacherModel.getAge())
//                .gender(teacherModel.getGender())
//                .profession(teacherModel.getProfession())
//                .user(user)
//                .cabinet(cabinet).build();
//
//        return teacherRepository.save(teacher);
//    }
//
//    @Override
//    public Teacher deleteTeacherById(Long id) {
//        Teacher teacher = getTeacherById(id);
//        if (teacher != null){
//            teacherRepository.delete(teacher);
//            return teacher;
//        }
//        return null;
//    }
//
//    @Override
//    public Teacher getTeacherById(Long id) {
//        return teacherRepository.findById(id).orElse(null);
//    }
}
