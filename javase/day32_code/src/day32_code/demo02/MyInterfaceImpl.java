package day32_code.demo02;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {


        System.out.println("覆盖重写了B方法");

    }

    @Override
    public void methodAbs() {


        System.out.println("覆盖重写了AB共有的抽象方法");


    }

    @Override
    public void methodDefault() {

        System.out.println("对多个接口中冲突的默认方法进行了覆盖重写");

    }
}
