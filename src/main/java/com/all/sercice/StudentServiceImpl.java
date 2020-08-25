package com.all.sercice;
import com.all.sercice.StudentService;
import com.all.entity.Student;
import com.all.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll(){
        return this.studentRepository.findAll();
    }

}
