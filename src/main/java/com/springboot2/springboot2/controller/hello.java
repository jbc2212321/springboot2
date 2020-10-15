package com.springboot2.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class hello {
    @RequestMapping("/h1")
    public String showHelloWorld(Model model){
        String[] Test =new String[]{"1.    43+(20-76²)+sin81/61","2.    cos√9*19","3.    cos78+√4"};
        model.addAttribute("msg",Test);
        return "题目";
    }

    @GetMapping("/register/in")
    @CrossOrigin
    public String Code(
            @RequestParam("phone") String phone){
        System.out.println(phone);
        return phone+"is none";
    }
}
