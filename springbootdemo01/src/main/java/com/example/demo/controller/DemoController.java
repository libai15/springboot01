/**
 * @ClassName:DemoController
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/3/29 23:35
 * @Version:1.0
 **/


package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class DemoController {

    @Autowired
    StudentService studentService;

    @Value("李白")
    private String name;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hellow world" + name;
    }

    @RequestMapping("/success")
    public String succ(Map<String, Object> map) {
        map.put("hello", "热部署牛逼");
        map.put("hi", "<h1>啊哈<h1>");
        map.put("list", Arrays.asList("金克斯", "奥巴马", "伊泽瑞尔"));
        return "success";
    }

    @RequestMapping("/getd")
    public String gerd() {
        return "222";
    }

    @RequestMapping("/hellojpa")
    @ResponseBody
    public String hellojpa() {
        return JSON.toJSONString(studentService.findAll());
    }

}
