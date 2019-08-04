/**
 * @ClassName:AnnotaTest
 * @Description: 自定义注解测试
 * @Author:xxp
 * @Date:2019/4/27 15:54
 * @Version:1.0
 **/


package vo;


@AnnotaDemo(author = "jinkes",desc = "测试",age = 28)
public class AnnotaTest {



    public static void main(String[] args) {

        AnnotaDemo an = AnnotaTest.class.getAnnotation(AnnotaDemo.class);
        System.out.println(an.age());
        System.out.println(an.author());
        System.out.println(an.desc());
        System.out.println(an.toString());
    }

}
