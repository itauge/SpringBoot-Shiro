package com.itauge.springbootshiro.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itauge.springbootshiro.entity.Account;
import com.itauge.springbootshiro.mapper.AccountMapper;
import com.itauge.springbootshiro.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account findByUsername(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        return accountMapper.selectOne(wrapper);
    }


}
