package com.store.activity.controller;

import com.store.activity.base.BaseResponse;
import com.store.activity.entity.User;
import com.store.activity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }
    @GetMapping("/to_register")
    public ModelAndView to_register(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("/register");
        return mv;
    }
    @GetMapping("/login")
    public BaseResponse<Integer> get(User user) {
        return  BaseResponse.successResponnse(userService.queryUserCount(user));
    }
    @PostMapping("/register")
    @Transactional
    public BaseResponse addUser(User user ){
        if(userService.queryUserCount(user)==0){
            userService.addUser(user);
        }else {
            return  BaseResponse.errorResponnse("该用户已存在");
        }
        return  BaseResponse.successResponnse();
    }
}
