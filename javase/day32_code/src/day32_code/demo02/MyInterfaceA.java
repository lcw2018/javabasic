package day32_code.demo02;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public interface MyInterfaceA {


    //错误写法，接口不能有静态代码块
   /* static {

    }*/


    //错误写法，接口不能有构造函数
    /*public MyInterfaceA() {
    }*/

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法AAA");
    }


}
