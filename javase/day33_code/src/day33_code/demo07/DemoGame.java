package day33_code.demo07;

/**
 * Create by chuanwen.li on 2019/7/3
 */
public class DemoGame {


    public static void main(String[] args) {

        Hero hero = new Hero();

        hero.setName("艾希"); //设置英雄的名字


//        hero.setSkill(new SkillImpl());//使用单独定义的实现类

// 还可以改成使用匿名内部类
   /*     Skill skill = new Skill() {


            @Override
            public void use() {

            }
        };


        hero.setSkill(skill);*/

        //进一步简化，同时使用匿名内部类和匿名对象


        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~biu~biu");
            }
        });

        hero.attack();

    }
}
