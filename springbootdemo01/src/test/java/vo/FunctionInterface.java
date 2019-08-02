package vo;

//这就是函数式接口 可以使用lambda表达式
@FunctionalInterface
public interface FunctionInterface {

    //有且只有一个抽象方法
    int operation(int a, int b);


}
