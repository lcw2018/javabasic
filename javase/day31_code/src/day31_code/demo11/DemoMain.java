package day31_code.demo11;

/**
 * Create by chuanwen.li on 2019/7/1
 */


public abstract class DemoMain {
    public static void main(String[] args) {

        //Animal animal = new Animal();错误写法！不能直接创建抽象类对象

        Cat cat = new Cat();

        cat.eat();   //猫吃鱼！


    }
}
