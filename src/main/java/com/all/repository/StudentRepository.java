package com.all.repository;

import com.all.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
}
