package day28_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */


public class Demo01PhoneOne {


    public static void main(String[] args) {

        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();

        Phone one = new Phone();

        System.out.println(one.brand);  //null
        System.out.println(one.price);  //0.0
        System.out.println(one.color);  //null

        one.brand = "苹果";

        one.price = 8845.33;

        one.color = "玫瑰金";


        System.out.println(one.brand);//苹果
        System.out.println(one.price); //8845.33
        System.out.println(one.color); //玫瑰金

        one.call("乔布斯"); //给乔布斯打电话

        one.sendMessage();//群发短信


    }

}
