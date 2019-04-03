/**
 * @ClassName:DemoController
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/3/29 23:35
 * @Version:1.0
 **/


package com.example.springboot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class DemoController {

    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hellow world" + name;
    }

    @RequestMapping("/success")
    public String succ(Map<String,Object> map){
        map.put("hello","热部署牛逼");
        map.put("hi", "<h1>啊哈<h1>");
        map.put("list", Arrays.asList("金克斯","奥巴马","伊泽瑞尔"));
        return "success";
    }

}
