package com.itke.springboot.junit.Test;


import com.itke.springboot.junit.MySpringBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class TestJunit {
    @Test
    public void test() {

        System.out.println("junit");

    }
}
