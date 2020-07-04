package com.example.dubboprovider.student.dbservice.impl;

import com.example.dubboprovider.student.dbservice.StudentDbservice;
import com.example.dubboprovider.student.entity.Student;
import com.example.dubboprovider.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentDbservice")
public class StudentDbserviceImpl implements StudentDbservice {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int save(Student student) {
        return studentMapper.save(student);
    }

    @Override
    public void update(Student entity) {
        studentMapper.update(entity);
    }

    @Override
    public void delete(Student entity) {
        studentMapper.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        studentMapper.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return studentMapper.findById(id);
    }

    @Override
    public List<Student> findByExample(Student student) {
        return studentMapper.findByExample(student);
    }
}
