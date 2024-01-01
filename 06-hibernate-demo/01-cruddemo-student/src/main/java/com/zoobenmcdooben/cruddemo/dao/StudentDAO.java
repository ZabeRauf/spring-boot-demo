package com.zoobenmcdooben.cruddemo.dao;

import com.zoobenmcdooben.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
