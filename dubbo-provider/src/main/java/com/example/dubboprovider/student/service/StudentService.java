package com.example.dubboprovider.student.service;

import com.example.dubboprovider.student.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 保存
     * @param student
     * @return
     */
    int save(Student student);

    /**
     * 更新
     * @param entity
     * @return
     */
    void update(Student entity);
    /**
     * 删除
     * @param entity
     * @return
     */
    void delete(Student entity);


    /**
     * 通过id删除
     * @param id
     * @return
     */
    void deleteById(Long id);


    /**
     *
     * @param id
     * @return
     */
    Student findById(Long id);


    /**
     *
     * @param student
     * @return
     */
    List<Student> findByExample(Student student);
}
