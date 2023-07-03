package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * create by hhh7ox on 2022/5/23 19:08
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/show/{username}")
    public User show(@PathVariable("username") String username){
        System.out.println(username);
        User user = null;
        if (username.equals("zhangsan")){
            user = new User("zhangsan","123456",17);
        }
        System.out.println(user);
        return user;
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        request.getSession().setAttribute("user","userasdas");
        System.out.println(request.getSession().getAttribute("user"));
        return "登录成功";
    }

}
