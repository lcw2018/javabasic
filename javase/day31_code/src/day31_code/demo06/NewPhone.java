package day31_code.demo06;

/**
 * Create by chuanwen.li on 2019/7/1
 */


//定义一个新手机使用老手机作为父类
public class NewPhone extends Phone {


    @Override
    public void show() {
        super.show();// 把父类的show方法拿过来重复利用
        // 自己子类再来添加更多内容

        System.out.println("显示姓名");


        System.out.println("显示头像");
    }
}
