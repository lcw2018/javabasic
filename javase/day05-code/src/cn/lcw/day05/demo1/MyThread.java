package cn.lcw.day05.demo1;

public class MyThread extends Thread {


    //定义指定线程名称的构造方法
    public MyThread(String name) {
        //调用父类的带参构造函数
        super(name);


    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "正在执行！" + i);
        }
    }
}
