package com.connor.controller;


import com.connor.beans.Students;
import com.connor.feign.StudentsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ConnorFu
 * @since 2021-08-30
 */
@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    StudentsFeign studentsFeign;

    @RequestMapping("show")
    public Students show(){

        return studentsFeign.getFirstStudent();

    }

}

