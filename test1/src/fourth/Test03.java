package fourth;

/**
 * @program: test1
 * @description: 以练习 2 创建的类为基础上，创建属于它的对象句柄的一个数组，但不要实际创建对象并分配到数组里。
 *                运行程序时，注意是否打印出来自构建器调用的初始化消息
 * @author: lgppppppp
 * @create: 2019-09-11 17:01
 **/
public class Test03 {
    public Test03(){
        System.out.println("Hello world");
    }

    public Test03(String msg){
        System.out.println("Hello world"+msg);
    }

    public static void main(String[] args) {
        Test03[] a=new Test03[5];
        System.out.println(a.length);
    }
}
