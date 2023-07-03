package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * create by hhh7ox on 2022/5/20 10:50
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add")
    public void add(@RequestParam("name") String name){
        System.out.println("添加用户"+name);
    }

    @RequestMapping("/add2")
    public void add(User user){
        System.out.println("添加用户"+user.toString());
    }

    @RequestMapping("/add3/{username}/{password}")
    public void add2(User user){
        System.out.println("添加用户"+user.toString());
    }

    @RequestMapping("/user/add4/{address}")
    public void add3(@PathVariable("address") String address){
        System.out.println("获取地址"+address);
    }

}
