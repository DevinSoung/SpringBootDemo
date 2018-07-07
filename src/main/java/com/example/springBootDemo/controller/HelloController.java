/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.example.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devin
 * @version $Id: HelloController on 2018/7/7 上午9:53.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}