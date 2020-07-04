package com.example.dubboconsumer.controller;

import com.example.dubboconsumer.bs.CallBs;
import dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "callBsService")
    private CallBs callBsService;

    @GetMapping("query")
    public UserDto getUser(){
        UserDto userDto = callBsService.getUserDto();
        return userDto;
    }
}
