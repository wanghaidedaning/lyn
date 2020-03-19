package com.store.activity.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("c_user")
public class User {
    @TableId
    private Integer id;//实体类的唯一标志
    @TableField(value = "user_name")
    private String userName;//名称

    @TableField(value = "user_phone")
    private String userPhone;//邮箱

    @TableField(value = "user_email")
    private String userEmail;//邮箱

    @TableField(value = "user_password")
    private String userPassword;//邮箱
}
