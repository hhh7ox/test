package com.qf.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * create by hhh7ox on 2022/5/23 20:50
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/upload")
    public String fileUpload(MultipartFile pic , String name, HttpServletRequest request){
        String originalFilename = pic.getOriginalFilename();
        System.out.println(originalFilename);

        try {
            pic.transferTo(new File("e://"+File.separator+originalFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/download")
    public String fileDownload(String name, HttpServletRequest request, HttpServletResponse response){
        String realPath = request.getServletContext().getRealPath("/down");
        String filename = realPath+File.separator +name;
        System.out.println(filename);
        try {
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(name,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            IOUtils.copy(new FileInputStream(filename),response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";


    }
}
