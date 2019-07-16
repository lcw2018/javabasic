package day28_code.demo03;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo03Person {


    public static void main(String[] args) {


        Person person = new Person();

        person.show();   //我叫：null,年龄0


        person.name = "赵丽颖";

        // person.age=12 错误的赋值运算，私有属性

        person.setAge(12);

        person.show();  //我叫：赵丽颖,年龄12


    }


}
