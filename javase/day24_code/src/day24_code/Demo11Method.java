package day24_code;

/**
 * Create by chuanwen.li on 2019/6/24
 */

/*
定义一个方法的格式：
public static void 方法名称() {
	方法体
}

方法名称的命名规则和变量一样，使用小驼峰。
方法体：也就是大括号当中可以包含任意条语句。

注意事项：
1. 方法定义的先后顺序无所谓。
2. 方法的定义不能产生嵌套包含关系。
3. 方法定义好了之后，不会执行的。如果要想执行，一定要进行方法的【调用】。

如何调用方法，格式：

方法名称();
*/
public class Demo11Method {


    public static void main(String[] args) {


        farmer();   //调用农民的方法
        seller();   //调用小商贩的方法
        cooker();   //调用厨师的方法
        me();       //调用吃货的方法


    }

    private static void me() {


        System.out.println("品尝");

    }

    private static void cooker() {


        System.out.println("洗菜");

        System.out.println("切菜");


        System.out.println("炒菜");


        System.out.println("装盘");


    }

    private static void seller() {

        System.out.println("运输到农贸市场");

        System.out.println("抬高价格");

        System.out.println("吆喝");


        System.out.println("卖给厨师");


    }

    private static void farmer() {

        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");

        System.out.println("收割");

        System.out.println("卖给小商贩");


    }
}
