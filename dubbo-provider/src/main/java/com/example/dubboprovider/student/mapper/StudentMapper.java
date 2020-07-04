package com.example.dubboprovider.student.mapper;

import com.example.dubboprovider.student.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper{
    /**
     * 保存
     * @param student
     * @return
     */
    int save(@Param("student") Student student);

    /**
     * 更新
     * @param entity
     * @return
     */
    void update(@Param("entity") Student entity);
    /**
     * 删除
     * @param entity
     * @return
     */
    void delete(@Param("entity") Student entity);


    /**
     * 通过id删除
     * @param id
     * @return
     */
    void deleteById(@Param("id") Long id);


    /**
     *
     * @param id
     * @return
     */
    Student findById(@Param("id") Long id);


    /**
     *
     * @param student
     * @return
     */
    List<Student> findByExample(@Param("student") Student student);



}
