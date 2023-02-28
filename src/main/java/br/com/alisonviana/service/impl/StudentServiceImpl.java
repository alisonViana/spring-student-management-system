package br.com.alisonviana.service.impl;

import br.com.alisonviana.entity.Student;
import br.com.alisonviana.repository.StudentRepository;
import br.com.alisonviana.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}