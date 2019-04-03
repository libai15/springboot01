/**
 * @ClassName:Dog
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/3/30 9:41
 * @Version:1.0
 **/


package com.example.springboot01.vo;

public class Dog {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


