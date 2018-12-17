package com.zy;

import com.zy.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringGitApplicationTests {
    @Autowired
    TestMapper testMapper;

    @Test
    public void contextLoads() {
        List<com.zy.entity.Test> list = testMapper.selectAll();
        for (com.zy.entity.Test test : list) {
            System.out.println(test);

        }
    }

}

