/**
 * @ClassName:StudentServiceImpl
 * @Description: serviceimpl
 * @Author:xxp
 * @Date:2019/7/27 23:41
 * @Version:1.0
 **/


package com.example.demo.serviceImpl;

import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;
import com.example.demo.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;


    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
