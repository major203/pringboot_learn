package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.User;
import com.login.service.UserService;

@RestController
@RequestMapping("/testBoot")
public class LoginCotroller {
    @Autowired
    private UserService userService;
 
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
    	User data=userService.GetUserByID(id);
        return "name:"+data.getName()+"-----passwd:"+data.getPassword();
    }
}
