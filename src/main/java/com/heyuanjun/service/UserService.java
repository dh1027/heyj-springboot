package com.heyuanjun.service;

import org.springframework.stereotype.Service;

/**
 * Created by deng on 2020/5/10.
 */
@Service
public class UserService {
    public String getUser() {
        return "{id:1,age:20,name:heyuanjun}";
    }
}
