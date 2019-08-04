package com.example.demo.dao;

import com.example.demo.vo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
  * @Author libai
  * @Description dao
  * @Date 23:37 2019/7/27
  **/

@Component
public interface StudentDao extends JpaRepository<Student,Long> {
    /*
     * 我们在这里直接继承 JpaRepository
     * 这里面已经有很多现场的方法了
     * 这也是JPA的一大优点
     *
     * */

}
