package com.lcw.Demo05Thread;

/*
    主线程:执行主(main)方法的线程

    单线程程序:java程序中只有一个线程
    执行从main方法开始,从上到下依次执行

    JVM执行main方法,main方法会进入到栈内存
    JVM会找操作系统开辟一条main方法通向cpu的执行路径
    cpu就可以通过这个路径来执行main方法
    而这个路径有一个名字,叫main(主)线程
 */
public class Demo01MainThread {

    public static void main(String[] args) {
        Person person1 = new Person("张三");
        person1.run();
        System.out.println(0 / 0);
        Person person2 = new Person("李四");//Exception in thread "main" java.lang.ArithmeticException: / by zero
        person2.run();
    }
}
