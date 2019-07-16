package day28_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo04PhoneParam {


    public static void main(String[] args) {


        Phone one = new Phone();

        one.brand = "苹果";
        one.price = 8834.2;

        one.color = "土豪金";

        method(one);// 传递进去的参数其实就是地址值


    }

    private static void method(Phone pram) {


        System.out.println(pram.brand);  //苹果
        System.out.println(pram.price);  //8834.2
        System.out.println(pram.color);  //土豪金


    }


}
