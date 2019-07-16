package day32_code.demo07;

/**
 * Create by chuanwen.li on 2019/7/2
 */
public class DemoMain {

    public static void main(String[] args) {


        Computer computer = new Computer();//先准备一台计算机


        computer.powerOn();//开机


        USB usb = new Mouse();//多态的写法，准备鼠标

        // 参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usb);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); //准备键盘  // 没有使用多态写法

        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); // 正确写法！也发生了向上转型

//      computer.useDevice(new Keyboard()); // 也是正确写法
        computer.powerOff();//关机


        method(10.0); // 正确写法，double --> double

        method(20);  // 正确写法，int --> double


        int a = 30;
        method(30);  // 正确写法，int --> double
    }


    public static void method(double num) {
        System.out.println(num);  //10.0  20.0 30.0
    }


}
