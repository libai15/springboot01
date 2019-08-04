/**
 * @ClassName:Student
 * @Description: vo
 * @Author:xxp
 * @Date:2019/8/4 13:13
 * @Version:1.0
 **/


package com.example.demo.vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Student {
    private Integer id;
    private String stuName;
    private Integer stuAge;
    private Date stuBirthday;
    private String stuSex;
    private String stuAddress;
    private Double stuMath;
    private Double stuEnglish;

    @Basic
    @Id
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stu_name", nullable = true, length = 50)
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "stu_age", nullable = true)
    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Basic
    @Column(name = "stu_birthday", nullable = true)
    public Date getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    @Basic
    @Column(name = "stu_sex", nullable = true, length = 10)
    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Basic
    @Column(name = "stu_address", nullable = true, length = 50)
    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    @Basic
    @Column(name = "stu_math", nullable = true, precision = 2)
    public Double getStuMath() {
        return stuMath;
    }

    public void setStuMath(Double stuMath) {
        this.stuMath = stuMath;
    }

    @Basic
    @Column(name = "stu_english", nullable = true, precision = 2)
    public Double getStuEnglish() {
        return stuEnglish;
    }

    public void setStuEnglish(Double stuEnglish) {
        this.stuEnglish = stuEnglish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(stuName, student.stuName) &&
                Objects.equals(stuAge, student.stuAge) &&
                Objects.equals(stuBirthday, student.stuBirthday) &&
                Objects.equals(stuSex, student.stuSex) &&
                Objects.equals(stuAddress, student.stuAddress) &&
                Objects.equals(stuMath, student.stuMath) &&
                Objects.equals(stuEnglish, student.stuEnglish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stuName, stuAge, stuBirthday, stuSex, stuAddress, stuMath, stuEnglish);
    }
}
