package com.itke.springboot.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class Quick2StartController {
private String name;
private Integer age;
@RequestMapping("/quick2")
@ResponseBody
public String quick(){

    return "springboot 访问成功! name="+name+",age="+age;
}


    public void setName(String name) {

        this.name = name;
    }
    public void setAge(Integer age) {

        this.age = age;
    }
}