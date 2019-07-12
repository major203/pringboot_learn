package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.User;
import com.login.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
    public User GetUserByID(int id){
        return userMapper.GetUserByID(id);
    }
}
