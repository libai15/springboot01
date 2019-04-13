/**
 * @ClassName:HelloController
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/3/31 19:59
 * @Version:1.0
 **/


package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    /**
      * @Author libai
      * @Description //TODO
      * @Date 20:02 2019/3/31
      * @Param []
      * @return java.lang.String
      **/ 
    
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    
}
