package day31_code.demo13;

/**
 * Create by chuanwen.li on 2019/7/1
 */
//子类也是抽象类
public abstract class Dog extends Animal {


    @Override
    public void eat() {
        System.out.println("狗吃骨头！");
    }
}
