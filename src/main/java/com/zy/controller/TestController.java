package com.zy.controller;

import com.zy.entity.Test;
import com.zy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("queryAll")
    public List<Test> queryAll() {
        return testService.queryAll();
    }
}
