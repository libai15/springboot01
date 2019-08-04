/**
 * @ClassName:myMVCConfig
 * @Description:
 * @Author:xxp
 * @Date:2019/4/5 9:50
 * @Version:1.0
 **/


package com.example.demo.vo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myMVCConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer  webMvcAutoConfiguration(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addRedirectViewController("/", "success");
                registry.addRedirectViewController("/index.html", "success");
            }
        };
        return webMvcConfigurer;
    }

    //则是注释
}
