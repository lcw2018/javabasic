package day32_code.demo07;

/**
 * Create by chuanwen.li on 2019/7/2
 */
//鼠标就是一个USE设备
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {

        System.out.println("关闭鼠标");

    }


    public void click() {

        System.out.println("鼠标点击");

    }


}
