package com.store.activity.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.store.activity.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {
}
