package com.itke.springboot.mybatis.mapper;

import com.itke.springboot.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> queryUserList();
}