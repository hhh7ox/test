package com.qf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by hhh7ox on 2022/5/23 12:44
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/show")
    public String show(String username){
        if (username.equals("zhangsan")){
            return "fail";
        }
        else{
            return "success";
        }
    }


}
