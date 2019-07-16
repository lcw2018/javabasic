package day29_code.demo04;

import java.util.ArrayList;

/**
 * Create by chuanwen.li on 2019/6/26
 */
/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从JDK 1.5+开始，支持自动装箱、自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<String> arrayA = new ArrayList<>();

        //ArrayList<int> arrayB = new ArrayList<int>();
        //错误写法，泛型只能是包装类型，不能是基本数据类型


        ArrayList<Integer> arrayC = new ArrayList<>();

        arrayC.add(100);
        arrayC.add(200);

        System.out.println(arrayC);   //[100, 200]


        Integer num = arrayC.get(1);

        System.out.println(num);   //200


    }


}
