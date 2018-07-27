package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @RequestMapping("getUser")
    public IMoocJSONResult getUser(){
        User u = new User();
        u.setName("jack");
        u.setAge(23);
        u.setPassword("123456");
        u.setBirthday(new Date());
        return IMoocJSONResult.ok(u);

    }
}
