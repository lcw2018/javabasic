package day29_code.demo04;

/**
 * Create by chuanwen.li on 2019/6/26
 */

/*
题目：
定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
public class Demo01Array {

    public static void main(String[] args) {

        // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] persons = new Person[3];


        Person one = new Person("赵丽颖", 20);

        Person two = new Person("王小七", 19);

        Person three = new Person("七小夕", 18);

        // 将one当中的地址值赋值到数组的0号元素位置
        persons[0] = one;
        persons[1] = two;
        persons[2] = three;


        System.out.println(persons[0]);//地址值
        System.out.println(persons[1]);//地址值
        System.out.println(persons[2]);//地址值
        System.out.println(persons[1].getName());  //王小七


    }


}
