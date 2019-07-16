package day28_code.demo05;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo01Student {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setName("王小七");
        stu1.setAge(18);
        System.out.println("姓名是：" + stu1.getName() + ",年龄是：" + stu1.getAge());//姓名是：王小七,年龄是：18

        System.out.println("===============================");


        Student stu2 = new Student();

        stu2.setName("佳依");
        stu2.setAge(19);

        System.out.println("姓名是：" + stu2.getName() + ",年龄是：" + stu2.getAge());//姓名是：佳依,年龄是：19


    }


}
