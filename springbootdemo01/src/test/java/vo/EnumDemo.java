/**
 * @ClassName:EnumDemo
 * @Description: 枚举测试
 * @Author:xxp
 * @Date:2019/4/27 10:48
 * @Version:1.0
 **/


package vo;

public class EnumDemo {
    public static void main(String[] args) {

        WeekDay weekDay=WeekDay.MON;
        System.out.println(weekDay);//输出枚举常量名
        System.out.println(weekDay.name());//输出对象名
        System.out.println(weekDay.getClass());//输出对应类
        System.out.println(weekDay.toString());//输出枚举对象名
        System.out.println(weekDay.ordinal());//输出此对象在枚举常量的次序
        System.out.println(WeekDay.valueOf("WED"));//将字符串转化为枚举常量
        System.out.println(WeekDay.values().length);//获取所以的枚举元素，并打印其长度
    }
    //定义枚举内部类
    public enum WeekDay{
        SUN(1),MON,TUE,WED,THI,FRI,SAT;//分号可有可无，但如果下面还有方法或其他成员时，分号不能省。
        //而且当有其他方法时，必须在这些枚举变量的下方。

        //无参构造器
        private WeekDay(){
            System.out.println("First");
        }
        //带参数的构造器
        private WeekDay(int day){
            System.out.println("Second");
        }
    }
}



