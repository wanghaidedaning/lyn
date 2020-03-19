package com.store.activity.controller;

import com.store.activity.entity.User;
import com.store.activity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
//    @GetMapping("/hello")
//    public String hello(){
//        User user =new User();
//        user.setId(1);
//        user =userService.queryUser(user);
//        return user.toString();
//    }
    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv =new ModelAndView();
        User user =new User();
        user.setId(1);
        user =userService.queryUser(user);
        mv.addObject("user",user);
        mv.setViewName("/index");
        return mv;
    }
}
