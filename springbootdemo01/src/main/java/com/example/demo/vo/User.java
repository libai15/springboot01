/**
 * @ClassName:User
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/8/3 21:31
 * @Version:1.0
 **/


package com.example.demo.vo;

import java.io.Serializable;

public class User implements Serializable {
    //生成序列化id
    private static final long serialVersionUID = -9082434493334047118L;
    private String id;
    private String name;
    private Integer age;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
