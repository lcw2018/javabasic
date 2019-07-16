package day31_code.demo12;

/**
 * Create by chuanwen.li on 2019/7/1
 */
public class Zi extends Fu {


    public Zi() {

        //super();
        System.out.println("子类构造方法执行！");


    }


    @Override
    public void eat() {
        System.out.println("吃饭！");
    }
}
