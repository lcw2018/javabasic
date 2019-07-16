package day32_code.demo01;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {

        System.out.println("实现类B覆盖重写了接口的默认方法");

    }
}
