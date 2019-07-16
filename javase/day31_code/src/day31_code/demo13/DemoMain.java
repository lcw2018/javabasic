package day31_code.demo13;

/**
 * Create by chuanwen.li on 2019/7/1
 */
public class DemoMain {

    public static void main(String[] args) {

        //Animal animal = new Animal(); // 错误！

        // Dog dog = new Dog();  // 错误，这也是抽象类


        Dog2Ha dog2Ha = new Dog2Ha();  // 这是普通类，可以直接new对象。

        dog2Ha.eat();
        dog2Ha.sleep();


        DogGolden dogGolden = new DogGolden();

        dogGolden.eat();
        dogGolden.sleep();


    }

}
