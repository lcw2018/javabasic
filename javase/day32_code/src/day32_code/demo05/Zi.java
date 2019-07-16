package day32_code.demo05;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public class Zi extends Fu {

    int num = 20;

    int age = 19;


    @Override
    public void showNum() {

        System.out.println(num);

    }


    @Override
    public void method() {

        System.out.println("子类方法");

    }


    public void methodZi() {

        System.out.println("子类特有方法");

    }


}
