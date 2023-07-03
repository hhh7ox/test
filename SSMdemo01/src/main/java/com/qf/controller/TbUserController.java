package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.constants.ResultCode;
import com.qf.dto.R;
import com.qf.exceptions.QueryException;
import com.qf.pojo.TbUser;
import com.qf.service.TbUserService;
import com.qf.utils.JudgeUtils;
import com.qf.utils.RUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * create by hhh7ox on 2022/5/24 11:23
 */

@RestController
@RequestMapping("/user")
public class TbUserController {
    private TbUserService tbUserService;

    @Autowired
    public void setTbUserService(TbUserService tbUserService){
        this.tbUserService = tbUserService;
    }

    @GetMapping("/showall")
    public R showAll(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum, @RequestParam(value = "pageSize",defaultValue = "2") int pageSize){
        PageInfo<TbUser> userPageInfo = tbUserService.queryAll(pageNum, pageSize);
        return RUtils.getQuerySuccess(userPageInfo);
    }

    @GetMapping("/show/{username}")
    public R show(@PathVariable("username") String username){
        TbUser tbUser = tbUserService.queryByTbUserName(username);
        return RUtils.getQuerySuccess(tbUser);
    }

    @PostMapping("/addtbuser" )
    public R addTbUser(@RequestBody TbUser tbUser){
        tbUserService.increase(tbUser);
        return RUtils.getIncreaseSuccess();
    }

    @PostMapping("/modify")
    public R modifyTbUser(@RequestBody TbUser tbUser){
        tbUserService.modify(tbUser);
        return RUtils.getModifySuccess();
    }

    @PostMapping("/login")
    public R login(@RequestBody TbUser tbUser, HttpServletRequest request){
        Assert.isTrue(!JudgeUtils.StringIsEmpty(tbUser.getUsername()),()->{
            throw new QueryException("登录用户名为空", ResultCode.LOGIN_FAIL);
        });
        tbUserService.queryByTbUserName(tbUser.getUsername());
        request.getSession().setAttribute("tbUser",tbUser);
        return RUtils.getLoginSuccess();
    }

}
