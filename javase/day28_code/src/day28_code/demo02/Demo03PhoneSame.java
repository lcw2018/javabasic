package day28_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo03PhoneSame {

    public static void main(String[] args) {


        Phone one = new Phone();

        System.out.println(one.brand); //null
        System.out.println(one.price); //0.0
        System.out.println(one.color); //null
        System.out.println("=================================");

        one.brand = "苹果";
        one.price = 8834.3;
        one.color = "土豪金";

        System.out.println(one.brand); //苹果
        System.out.println(one.price); //8834.3
        System.out.println(one.color); //土豪金

        one.call("给乔布斯打电话");
        one.sendMessage();//群发短信
        System.out.println("==================================");

        Phone two = one;

        System.out.println(two.brand); //苹果
        System.out.println(two.price); //8834.3
        System.out.println(two.color); //土豪金

        System.out.println("====================================");

        two.brand = "三星";
        two.price = 4434.4;
        two.color = "黑色";


        System.out.println(two.brand);  //三星
        System.out.println(two.price);  //4434.4
        System.out.println(two.color);  //黑色


        two.call("给欧巴打电话");
        two.sendMessage();//群发短信


    }


}
