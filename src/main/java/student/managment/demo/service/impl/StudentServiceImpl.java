package student.managment.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.managment.demo.entity.Student;
import student.managment.demo.repository.StudentRepo;
import student.managment.demo.service.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
            studentRepo.deleteById(id);
    }
}
