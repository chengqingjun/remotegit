package com.example.chengqj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheng on 2017/8/1.
 */
@RestController
public class HelloWorldController {
    @Autowired
    private NeoProperties neoProperties;
    @RequestMapping("/hello")
    public String index() {
        System.out.println(neoProperties.getTitle());
        return "Hello World";
    }

    public NeoProperties getNeoProperties() {
        return neoProperties;
    }

    public void setNeoProperties(NeoProperties neoProperties) {
        this.neoProperties = neoProperties;
    }
}
