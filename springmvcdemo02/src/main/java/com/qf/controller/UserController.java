package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * create by hhh7ox on 2022/5/20 17:39
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void getUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/show/{id}")
    @ResponseBody
    public User showUser(@PathVariable("id") Long id){
        User user = userService.findUserById(id);
        return user;
    }

}
