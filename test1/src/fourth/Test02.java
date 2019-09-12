package fourth;

/**
 * @program: test1
 * @description: 在练习 1 的基础上增加一个过载的构建器，令其采用一个 String 自变量，并随同自己的消息打印出来
 * @author: lgppppppp
 * @create: 2019-09-11 16:56
 **/
public class Test02 {
    public Test02(){
        System.out.println("Hello world");
    }

    public Test02(String msg){
        System.out.println("Hello world"+msg);
    }

    public static void main(String[] args) {
        new Test02(" haha");
    }
}
