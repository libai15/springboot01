package com.example.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations = {"classpath:bean.xml"})    //导入sping配置文件
public class Springboot01Application {


    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
