/**
 * @ClassName:Dog
 * @Description: vo
 * @Author:xxp
 * @Date:2019/3/30 9:41
 * @Version:1.0
 **/


package com.example.demo.vo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dog {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println();
        String userName = "libai";
        List<String> list = new ArrayList<>();
        list.add(userName);
        list.add("lihei");
        //重写

    }

    public String dateToString(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    //这里重载一个方法
    //可是我有时候 宁愿选择留恋不放手 等到风景都看透 也许你会陪我到细水长流
    //没关系 你也不用给我机会  反正我还有一生可以浪费
//黄萍 黄萍 黄萍  黄萍


}


