package com.example.demo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
  * @Author libai
  * @Description 测试实体类
  * @Date 11:53 2019/8/4
  * @Param
  * @return
  **/

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String sex;

    public User(){}

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
