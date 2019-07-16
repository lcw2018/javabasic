package day32_code.demo06;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }


    //猫的特有方法
    public void catchMouse() {

        System.out.println("猫捉老鼠");

    }


}

