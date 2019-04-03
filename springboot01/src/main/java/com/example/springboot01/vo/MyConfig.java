/**
 * @ClassName:config
 * @Description: 用配置类的方式取代配置文件,用@bean替代<bean></bean>
 * @Author:xxp
 * @Date:2019/3/30 11:18
 * @Version:1.0
 **/


package com.example.springboot01.vo;

import com.example.springboot01.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中
    @Bean
    public HelloService helloService(){
        System.out.println("创建了组件");
        return new HelloService();
    }

}
