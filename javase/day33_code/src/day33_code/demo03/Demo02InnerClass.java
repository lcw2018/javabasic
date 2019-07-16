package day33_code.demo03;

/**
 * Create by chuanwen.li on 2019/7/3
 */
public class Demo02InnerClass {

    public static void main(String[] args) {


        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();

        Outer.Inner obj = new Outer().new Inner();

        obj.methodInnner();


    }


}
