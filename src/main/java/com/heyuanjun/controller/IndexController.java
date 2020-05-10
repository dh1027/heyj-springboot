package com.heyuanjun.controller;

import com.heyuanjun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/pageIndex")
    public String pageIndex() {
        return "pageIndex";
    }

    @RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String index() {
        return "我的第一个手写SpringBoot";
    }

    @RequestMapping(value = "/getUsers", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getUsers() {
        return userService.getUser();
    }

}