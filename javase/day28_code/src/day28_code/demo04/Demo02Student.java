package day28_code.demo04;

/**
 * Create by chuanwen.li on 2019/6/26
 */
public class Demo02Student {


    public static void main(String[] args) {


        Student stu = new Student();//无参构造


        System.out.println("=======================");


        Student stu2 = new Student("赵丽颖", 20);

        System.out.println("姓名" + stu2.getName() + ",年龄" + stu2.getAge());//全参构造

        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(19);//改变年龄

        System.out.println("姓名" + stu2.getName() + ",年龄" + stu2.getAge());


    }


}
