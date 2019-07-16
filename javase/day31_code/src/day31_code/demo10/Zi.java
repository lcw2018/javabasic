package day31_code.demo10;

/**
 * Create by chuanwen.li on 2019/7/1
 */
public class Zi extends Fu {

    int num = 20;


    @Override
    public void method() {
        super.method();  //调用父类方法

        System.out.println("子类方法");

    }

    public void showNum() {

        int num = 30;

        System.out.println(num);       //30
        System.out.println(this.num);  //20
        System.out.println(super.num); //10

    }


}
