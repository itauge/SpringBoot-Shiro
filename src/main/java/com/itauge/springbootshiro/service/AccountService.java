package com.itauge.springbootshiro.service;

import com.itauge.springbootshiro.entity.Account;
import org.springframework.stereotype.Service;

public interface AccountService {
    public Account findByUsername(String username);
}
