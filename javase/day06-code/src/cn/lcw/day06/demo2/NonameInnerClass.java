package cn.lcw.day06.demo2;

public class NonameInnerClass {


    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {
                    System.out.println("库里" + " " + i);
                }

            }
        };

        new Thread(r).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("詹姆斯" + " " + i);
        }


    }


}
