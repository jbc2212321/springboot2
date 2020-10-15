package com.springboot2.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class register {
    @RequestMapping("/register")
    public String GetRegister(){
        return "注册";
    }
}
