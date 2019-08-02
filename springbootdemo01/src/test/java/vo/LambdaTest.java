/**
 * @ClassName:LambdaTest
 * @Description: //测试lambda表达式
 * @Author:xxp
 * @Date:2019/4/27 18:51
 * @Version:1.0
 **/

//主要写了一下lambda 和 stream 和 函数式接口
package vo;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaTest {

    //Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。
    // 在上面例子中，我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
    //Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
    //搭配函数式接口使用

    //lambda--接口

    //引出函数式接口

    /*Lambda 表达式是如何在java的类型系统中表示的呢？每一个lambda表达式都对应一个类型，通常是接口类型。
     而“函数式接口”是指仅仅只包含一个抽象方法的 接口，每一个该类型的lambda表达式都会被匹配到这个抽象方法。
     因为 默认方法 不算抽象方法，所以你也可以给你的函数式接口添加默认方法。*/

    /*我们可以将lambda表达式当作任意只包含一个抽象方法的接口类型，确保你的接口一定达到这个要求，
     你只需要给你的接口添加 @FunctionalInterface 注解，编
     译器如果发现你标注了这个注解的接口有多于一个抽象方法的时候会报错的*/

    //根据上述说明  函数式接口主要是为了lambda服务  @FunctionalInterface 注解 并且有且只有一个抽象方法 即可使用lambda表达式

    public static void main(String[] args) {

        LambdaTest test = new LambdaTest();

        MathOperation add = (int a ,int b) -> a+b;

        MathOperation red = (int a ,int b) -> a+b;

        MathOperation mul = (int a ,int b) -> a*b;

        MathOperation div = (int a ,int b) -> a/b;

        System.out.println(add.operation(5, 5));




        //老版本排序
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        //lambda表达式的写法
        Collections.sort(names,( a , b) -> b.compareTo(a));

        //测试函数式接口
        FunctionInterface finter = (a,b)->a+b;

        System.out.println(finter.operation(11, 3));

        //Stream测试
        //filter()过滤

        names.stream().filter((s)->s.endsWith("a")).forEach(System.out::print);

        List sb = names.stream().map(String::toUpperCase).sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
        sb.forEach(o -> System.out.print(o+"  "));

        //对map的操作
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id,val)-> System.out.print(id+"+"+val+"  "));

        map.computeIfPresent(3, (a,b)->a+b);
        System.out.println(map.get(3));

        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);   // legacy java.util.Date

        System.out.println(ZoneId.getAvailableZoneIds());
        // prints all available timezone ids
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
        // ZoneRules[currentStandardOffset=+01:00]
        // ZoneRules[currentStandardOffset=-03:00]

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println(now1.isBefore(now2));  // false

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);       // -3
        System.out.println(minutesBetween);     // -239


        //多重注解 好像并没有什么乱用

        //Optional  主要用来判断空吧
    }

    //定义一个接口
    interface MathOperation{
        int operation(int a, int b);
    }


    //还是这个字体好看
    String sss = "{\"sb\": \"sss\",\"ssss\": \"ssss\"}";

}
