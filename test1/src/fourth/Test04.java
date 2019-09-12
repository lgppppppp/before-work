package fourth;

/**
 * @program: test1
 * @description: 创建同句柄数组联系起来的对象，最终完成练习 3
 * @author: lgppppppp
 * @create: 2019-09-11 17:03
 **/
public class Test04 {
    public Test04(){
        System.out.println("Hello world");
    }

    public Test04(String msg){
        System.out.println("Hello world"+msg);
    }

    public static void main(String[] args) {
        Test04[] a=new Test04[5];
        for(int i=0;i<a.length;i++){
            a[i]=new Test04();
        }
        System.out.println(a.length);
    }
}
