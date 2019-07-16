package com.lcw.demo04.Lambda;

/*
    需求:
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
 */
public class Demo01Cook {


    public static void main(String[] args) {

        //调用invoke方法，方法参数为Cook接口，传递Cook接口的匿名内部类对象
        invoke(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        //使用lambda表达式，简化匿名内部类的书写
        invoke(() -> {
            System.out.println("吃饭了");
        });
        //简化lambda

        invoke(() -> System.out.println("吃放了"));


    }

    //定义一个方法，方法参数为Cook接口，方法内部调用Cook接口的makeFood方法
    private static void invoke(Cook cook) {

        cook.makeFood();

    }


}
