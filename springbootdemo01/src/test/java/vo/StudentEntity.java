/**
 * @ClassName:StudentEntity
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/7/27 23:31
 * @Version:1.0
 **/


package vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "db5", catalog = "")
public class StudentEntity {
    private Integer id;
    private byte[] stuName;
    private Integer stuAge;
    private Date stuBirthday;
    private String stuSex;
    private String stuAddress;
    private Double stuMath;
    private Double stuEnglish;

    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stu_name", nullable = true)
    public byte[] getStuName() {
        return stuName;
    }

    public void setStuName(byte[] stuName) {
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
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id) &&
                Arrays.equals(stuName, that.stuName) &&
                Objects.equals(stuAge, that.stuAge) &&
                Objects.equals(stuBirthday, that.stuBirthday) &&
                Objects.equals(stuSex, that.stuSex) &&
                Objects.equals(stuAddress, that.stuAddress) &&
                Objects.equals(stuMath, that.stuMath) &&
                Objects.equals(stuEnglish, that.stuEnglish);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, stuAge, stuBirthday, stuSex, stuAddress, stuMath, stuEnglish);
        result = 31 * result + Arrays.hashCode(stuName);
        return result;
    }
}
