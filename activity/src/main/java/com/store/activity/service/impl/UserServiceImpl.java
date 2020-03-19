package com.store.activity.service.impl;

import com.store.activity.dao.UserMapper;
import com.store.activity.entity.User;
import com.store.activity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUser(User user) {
        return userMapper.selectOne(user);
    }
}
