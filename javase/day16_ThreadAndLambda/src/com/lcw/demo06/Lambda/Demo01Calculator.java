package com.lcw.demo06.Lambda;

/*
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        //调用invoke方法，方法的参数是一个借口，可以使用匿名内部类的方式
        invoke(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        //使用lambda表达式简化匿名内部类的书写
        invoke(100, 200, (a, b) -> {
            return a + b;
        });
        //简化lambda
        invoke(100, 200, (a, b) -> a + b);

    }

    /*
            定义一个方法
            参数传递两个int类型的整数
            参数传递Calculator接口
            方法内部调用Calculator中的方法calc计算两个整数的和
         */
    private static void invoke(int a, int b, Calculator calculator) {

        int calc = calculator.calc(a, b);
        System.out.println(calc);

    }
}
