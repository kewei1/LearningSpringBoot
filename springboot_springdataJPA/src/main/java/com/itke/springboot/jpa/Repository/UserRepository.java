package com.itke.springboot.jpa.Repository;

import com.itke.springboot.jpa.MySpringBootApplication;
import com.itke.springboot.jpa.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
public List<User> findAll();
}