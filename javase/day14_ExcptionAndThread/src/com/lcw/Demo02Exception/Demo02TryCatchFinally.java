package com.lcw.Demo02Exception;

import java.io.FileNotFoundException;

/*
    finally代码块
     格式:
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
            异常的处理逻辑,抛出异常对象之后,怎么处理异常对象
            一般在工作中,会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名 变量名){

        }finally{
            无论是否出现异常都会执行
        }
     注意:
        1.finally不能单独使用,必须和try一起使用
        2.finally一般用于资源释放(资源回收),无论程序是否出现异常,最后都要资源释放(IO)
 */
public class Demo02TryCatchFinally {


    public static void main(String[] args) {

        try {
            //可能出现异常的代码
            readFile("c:\\a.tx");
        } catch (FileNotFoundException e) {

            //异常处理逻辑
            e.printStackTrace();
        }finally {
            //无论是否出现异常都会执行
            System.out.println("释放资源");
        }


    }

/*    对输入的路径进行合法性校验，如果文件路径不是以“.txt”结尾，就抛出IO异常
    告知方法的调用者，文件后缀名不对*/

    private static void readFile(String path) throws FileNotFoundException {
        if (!path.endsWith(".txt")) {
            throw new FileNotFoundException("文件后缀名不对");

        }
        System.out.println("文件路径正确，读取文件");

    }


}
