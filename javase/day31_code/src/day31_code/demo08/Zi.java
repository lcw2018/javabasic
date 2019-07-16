package day31_code.demo08;

/**
 * Create by chuanwen.li on 2019/7/1
 */

/*
super关键字的用法有三种：
1. 在子类的成员方法中，访问父类的成员变量。
2. 在子类的成员方法中，访问父类的成员方法。
3. 在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu {


    int num = 20;


    public Zi() {

        super();  //调用父类的无参构造

    }


    public void methodZi() {

        System.out.println(super.num); //调用父类的num


    }

    @Override
    public void method() {

        super.method();//调用父类的method


        System.out.println("子类方法");
    }
}
