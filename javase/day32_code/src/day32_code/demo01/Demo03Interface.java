package day32_code.demo01;

/**
 * Create by chuanwen.li on 2019/7/2
 */

/*
注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。
格式：
接口名称.静态方法名(参数);
 */
public class Demo03Interface {

    public static void main(String[] args) {

        //创建实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误写法
        //impl.methodStatic();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();

    }


}
