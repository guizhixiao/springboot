package com.fly.project.controller;

import com.fly.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Value("${student.name}")
    private String name ;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUserList")
    public List<Map<String, String>> getUser() {
        System.out.println("name:"+name);
        return userService.getUserList();
    }


}
