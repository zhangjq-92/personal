package com.example.dubboprovider.student.service.impl;

import com.example.dubboprovider.student.dbservice.StudentDbservice;
import com.example.dubboprovider.student.entity.Student;
import com.example.dubboprovider.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource(name = "studentDbservice")
    private StudentDbservice studentDbservice;

    @Override
    public int save(Student student) {
        return studentDbservice.save(student);
    }

    @Override
    public void update(Student entity) {
        studentDbservice.update(entity);
    }

    @Override
    public void delete(Student entity) {
        studentDbservice.delete(entity);
    }

    @Override
    public void deleteById(Long id) {

        studentDbservice.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        String key = "student_" + id;
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Student student = null;
        if (redisTemplate.hasKey(key)){
            student = (Student) valueOperations.get(key);
            return student;
        }else {
            student = studentDbservice.findById(id);
            valueOperations.set(key, student, 1, TimeUnit.MINUTES);
            return student;
        }

    }

    @Override
    public List<Student> findByExample(Student student) {
        return studentDbservice.findByExample(student);
    }
}
