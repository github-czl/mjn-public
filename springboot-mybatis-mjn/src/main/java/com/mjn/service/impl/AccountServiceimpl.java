package com.mjn.service.impl;


import com.mjn.dao.AccountDao;
import com.mjn.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceimpl implements AccountService {
    @Resource
    private AccountDao accountDao;

}
