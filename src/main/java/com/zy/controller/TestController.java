package com.zy.controller;

import com.zy.entity.Test;
import com.zy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping("queryAll")
    public List<Test> queryAll() {
        System.out.println("33333333333333333");

        return testService.queryAll();
    }
}
