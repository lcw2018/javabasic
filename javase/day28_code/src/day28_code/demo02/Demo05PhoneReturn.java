package day28_code.demo02;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo05PhoneReturn {


    public static void main(String[] args) {


        Phone two = getPhone();

        System.out.println(two.brand); //苹果
        System.out.println(two.price); //8834.2
        System.out.println(two.color); //土豪金


    }

    private static Phone getPhone() {

        Phone phone = new Phone();

        phone.brand = "苹果";
        phone.price = 8834.2;
        phone.color = "土豪金";
        return phone;

    }


}
