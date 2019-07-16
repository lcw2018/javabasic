package day32_code.demo07;

/**
 * Create by chuanwen.li on 2019/7/2
 */

//键盘就是一个USB设备
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {

        System.out.println("关闭键盘");


    }

    public void type() {


        System.out.println("键盘输入");
    }


}
