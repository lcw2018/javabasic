package com.lcw.day10.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo {


    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(97);


        PrintStream ps = new PrintStream("d:\\1.txt");

        System.setOut(ps);
        System.out.println(97);
        System.out.println(123);


    }


}
