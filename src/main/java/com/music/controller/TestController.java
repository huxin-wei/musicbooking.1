package com.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang on 8/21/21 10:49 PM
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
//        int result = 10/0;
        return "guitar music";
    }
}
