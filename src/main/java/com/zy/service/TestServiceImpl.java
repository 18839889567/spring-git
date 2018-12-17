package com.zy.service;

import com.zy.entity.Test;
import com.zy.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public List<Test> queryAll() {
        return testMapper.selectAll();
    }
}
