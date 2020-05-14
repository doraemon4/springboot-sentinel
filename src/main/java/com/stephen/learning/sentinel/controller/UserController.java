package com.stephen.learning.sentinel.controller;

import com.stephen.learning.sentinel.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jack
 * @description
 * @date 2020/4/27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public List<User> queryAll(){
        List<User> users = new ArrayList<>();
        users.add(User.builder().name("jack").address("湖北襄阳").email("132325365@qq.com").build());
        users.add(User.builder().name("jack").address("湖北襄阳").email("132325365@qq.com").build());
        users.add(User.builder().name("jack").address("湖北襄阳").email("132325365@qq.com").build());
        users.add(User.builder().name("jack").address("湖北襄阳").email("132325365@qq.com").build());
        users.add(User.builder().name("jack").address("湖北襄阳").email("132325365@qq.com").build());
        return users;
    }
}
