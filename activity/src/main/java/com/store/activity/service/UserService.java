package com.store.activity.service;

import com.store.activity.base.BaseResponse;
import com.store.activity.entity.User;

public interface UserService {
    User queryUser(User user);

    int queryUserCount(User user);

    Integer addUser(User user);
}
