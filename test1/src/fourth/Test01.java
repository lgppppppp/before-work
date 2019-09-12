package fourth;

/**
 * @program: test1
 * @description: 用默认构建器创建一个类（没有自变量），用它打印一条消息。创建属于这个类的一个对象
 * @author: lgppppppp
 * @create: 2019-09-11 16:51
 **/
public class Test01 {
    public Test01(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        new Test01();
    }
}