package com.mjn.controller;

import com.mjn.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class AccountController {
    @Resource
    private AccountService accountService;

}
