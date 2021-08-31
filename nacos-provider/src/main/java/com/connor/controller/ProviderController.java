package com.connor.controller;

import com.connor.beans.Students;
import com.connor.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class ProviderController {

    @Value("${myname}")
    private String name;

    @Value("${othername}")
    private String other;

    @Value("${age}")
    private int age;

    @Resource
    StudentsMapper studentsMapper;

    @RequestMapping("/hello")
    public String hello(){
        return "hello"+name+","+other+","+age;
    }

    @RequestMapping("/getOne")
    public Students getFirstStudent(){
        return studentsMapper.selectById(1);
    }

}
