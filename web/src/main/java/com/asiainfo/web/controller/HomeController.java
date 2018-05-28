package com.asiainfo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xuegangliu
 * @date: 5/24/2018 8:10 PM
 * @DES:
 * @version: v1.0
 */
@RestController
public class HomeController {

    @RequestMapping(name = "/index",method = RequestMethod.GET)
    public String home(){
        return "hello";
    }
}
