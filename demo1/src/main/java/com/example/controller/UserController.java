package com.example.controller;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping
//    @RequestMapping("/a")
    public List<User> findAll() {

        return userMapper.selectAll();
    }
}
