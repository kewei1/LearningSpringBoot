package com.itke.springboot.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {

@Value("${person.name}")
private String name;

@Value("${person.age}")
private Integer age;

@RequestMapping("/quick")
@ResponseBody
public String quick(){
    return "springboot 访问成功! name="+name+",age="+age;
    }
}