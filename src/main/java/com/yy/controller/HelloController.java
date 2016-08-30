package com.yy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springboot get started
 * @author skyler
 *
 */
@Controller
@RequestMapping("/hello")
//@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
