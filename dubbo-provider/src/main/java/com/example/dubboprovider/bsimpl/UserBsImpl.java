package com.example.dubboprovider.bsimpl;

import bs.UserBs;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboprovider.student.entity.Student;
import com.example.dubboprovider.student.service.StudentService;
import dto.UserDto;

import javax.annotation.Resource;

@Service
public class UserBsImpl implements UserBs {

    @Resource(name = "studentService")
    private StudentService studentService;

    @Override
    public UserDto get() {
        Student student = null;
        try {
            student = studentService.findById(1L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserDto userDto = new UserDto();
        userDto.setAge(student.getAge());
        userDto.setName(student.getName());
        return userDto;
    }
}
