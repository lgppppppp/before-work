package fifth;

/**
 * @program: test1
 * @description: 用 public、private、protected 以及“友好的”数据成员及方法成员创建一个类。
 * 创建属于这个类的一个对象，并观察在试图访问所有类成员时会获得哪种类型的编译器错误提示。
 * 注意同一个目录内的类属于 “默认”包的一部分
 * @author: lgppppppp
 * @create: 2019-09-12 13:57
 **/

public class Test01 {
    private String str1 = "aaa";

    protected String str2 = "bbb";

    public String str3 = "ccc";

    private void debug1() {
        System.out.println("debug1");
    }

    protected void debug2() {
        System.out.println("debug2");
    }

    public void debug3() {
        System.out.println("debug3");
    }
}

