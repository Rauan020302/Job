package itacademy.project.service;

import itacademy.project.entity.*;
import itacademy.project.model.StudentModel;
import itacademy.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired
//    private StudentRepository studentRepository;
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private TeacherService teacherService;
//    @Autowired
//    private MarkService markService;
//    @Autowired
//    private CabinetService cabinetService;
//    @Override
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    @Override
//    public Student save(StudentModel studentModel) {
//        User user = userService.getUserById(studentModel.getUserId());
//        Teacher teacher = teacherService.getTeacherById(studentModel.getTeacherId());
//        Mark mark = markService.getMarkById(studentModel.getMarkId());
//        Cabinet cabinet = cabinetService.getCabinetById(studentModel.getCabinetId());
//        if (user == null || teacher == null || mark == null || cabinet == null )return null;
//        Student student = Student.builder()
//                .name(studentModel.getName())
//                .age(studentModel.getAge())
//                .mark(mark)
//                .gender(studentModel.getGender())
//                .cabinet(cabinet)
//                //.teacher(teacher)
//                .user(user).build();
//        return studentRepository.save(student);
//    }
//
//    @Override
//    public Student getStudentById(Long id) {
//        return studentRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Student deleteStudentById(Long id) {
//        Student student = getStudentById(id);
//        if (student != null){
//            studentRepository.delete(student);
//            return student;
//        }
//        return null;
//    }
//
//    @Override
//    public Optional<Student> getStudentByStudentName(String studentName) {
//        return studentRepository.findAllByName(studentName);
//    }
}
