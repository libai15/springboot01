package vo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)//元注释
@Target(ElementType.TYPE)
public @interface AnnotaDemo {
    String desc();

    String author();

    int age() default 15;

}
