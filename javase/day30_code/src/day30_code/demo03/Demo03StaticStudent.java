package day30_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo03StaticStudent {

    public static void main(String[] args) {

        // 首先设置一下教室，这是静态的东西，应该通过类名称进行调用

        Student.room = "101教室";


        Student one = new Student("郭靖", 20);

        System.out.println("one的姓名是：" + one.getName());
        System.out.println("one的年龄是：" + one.getAge());
        System.out.println("one的教室是：" + Student.room);

        System.out.println("================================");


        Student two = new Student("黄蓉", 18);

        System.out.println("two的姓名是：" + two.getName());
        System.out.println("two的年龄是：" + two.getAge());
        System.out.println("two的教室是：" + Student.room);


    }
}
