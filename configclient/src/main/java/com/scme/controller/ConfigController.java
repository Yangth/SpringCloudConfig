package com.scme.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/16.
 */
@RestController
public class ConfigController {
    @Value("${userNamess}")
    private String userNamess;

    @RequestMapping("/getconfigtext")
    public String pringConfigText(){
        return userNamess;
    }
}
