package day31_code.demo02;

/**
 * Create by chuanwen.li on 2019/7/1
 */
public class Zi  extends Fu{


    int numZi = 20;


    int num = 200;


    public void methodZi() {


        //使用子类自己的，不会去父类中寻找
        System.out.println(num);


    }


}
