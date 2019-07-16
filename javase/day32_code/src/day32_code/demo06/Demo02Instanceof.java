package day32_code.demo06;

/**
 * Create by chuanwen.li on 2019/7/2
 */

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Demo02Instanceof {
    public static void main(String[] args) {

        Animal animal = new Dog();//本来是一只狗
        animal.eat();//够吃骨头


        // 如果希望掉用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {

            Dog dog = (Dog) animal;
            dog.watchDoor();
        }
        // 判断一下animal本来是不是Cat
        if (animal instanceof Cat) {


            Cat cat = (Cat) animal;

            cat.catchMouse();
        }

        GetMeAPet(new Dog());


    }

    private static void GetMeAPet(Animal animal) {

        if (animal instanceof Dog) {

            Dog dog = (Dog) animal;
            dog.watchDoor();
        }

        if (animal instanceof Cat) {


            Cat cat = (Cat) animal;

            cat.catchMouse();
        }


    }

}
