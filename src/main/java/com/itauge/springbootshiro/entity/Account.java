package com.itauge.springbootshiro.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class Account {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String role;
    private String perms;
}
