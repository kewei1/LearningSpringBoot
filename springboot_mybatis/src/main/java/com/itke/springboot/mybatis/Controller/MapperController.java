package com.itke.springboot.mybatis.Controller;

import com.itke.springboot.mybatis.mapper.UserMapper;
import com.itke.springboot.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {

@Autowired
private UserMapper userMapper;


@RequestMapping("/queryUser")
@ResponseBody
public List<User> queryUser(){
List<User> users = userMapper.queryUserList();
    return users;
    }
}
