package com.example.dubboconsumer.bs.impl;

import bs.UserBs;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboconsumer.bs.CallBs;
import dto.UserDto;
import org.springframework.stereotype.Service;

@Service("callBsService")
public class CallBsImpl implements CallBs {

    @Reference
    private UserBs userBs;

    @Override
    public UserDto getUserDto() {
        UserDto userDto = userBs.get();
        return userDto;
    }
}
