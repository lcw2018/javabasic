package day31_code.demo06;

/**
 * Create by chuanwen.li on 2019/7/1
 */
public class Demo01Phone {


    public static void main(String[] args) {

        Phone phone = new Phone();

        phone.call();
        phone.send();
        phone.show();

        System.out.println("==================================");

        NewPhone newPhone = new NewPhone();

        newPhone.call();
        newPhone.send();
        newPhone.show();


    }


}
