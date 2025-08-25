package com.example.jdbctemplatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public int save(Student emp) {
        return repository.save(emp);
    }

    public Student getById(int id) {
        return repository.findById(id);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public int update(Student emp) {
        return repository.update(emp);
    }

    public int delete(int id) {
        return repository.deleteById(id);
    }
}

