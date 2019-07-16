package day33_code.demo06;

/**
 * Create by chuanwen.li on 2019/7/3
 */
public class Hero {

    private String name;//英雄的姓名

    private int age; //英雄的年龄

    private Weapon weapon;//武器


    public void attack() {

        System.out.println("年龄为：" + age + "的" + name + "用" + weapon.getCode() + "攻击了对方！");


    }

    public Hero() {
    }


    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
