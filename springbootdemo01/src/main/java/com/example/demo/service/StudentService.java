package com.example.demo.service;

import com.example.demo.vo.Student;

import java.util.List;


public interface StudentService {

    /**
      * @Author libai
      * @Description
      * @Date 23:45 2019/7/27
      * @param
      * @return java.util.List<com.example.demo.vo.StudentEntity>
      **/ 
    
    List<Student> findAll();

}
