package com.gx.resmanage;

import com.gx.resmanage.configuration.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.annotation.Validated;

/**
 * springBoot的单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResmanageApplicationTests {


    @Autowired
    Person person;

    @Test
    public void contextLoads() {

        System.out.println(person);
    }

}
