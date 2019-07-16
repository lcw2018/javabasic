package day33_code.demo03;

/**
 * Create by chuanwen.li on 2019/7/3
 */
public class Body {  //外部类


    public class Heart {//成员内部类


        //内部类中的方法
        public void beat() {


            System.out.println("心脏跳动：蹦蹦蹦！");

            System.out.println("我叫：" + name);//正确写法


        }


    }


    //外部类中方法
    public void methodBody() {


        System.out.println("外部类中的方法");

        new Heart().beat();

    }

    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
