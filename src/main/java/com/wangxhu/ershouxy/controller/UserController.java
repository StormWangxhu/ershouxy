package com.wangxhu.ershouxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "success";
    }
}
