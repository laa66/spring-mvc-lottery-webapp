package com.laa66.springmvc.lottery.app.controller;


import com.laa66.springmvc.lottery.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {

    @Autowired
    private UserService userService;


}
