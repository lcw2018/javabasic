package com.lcw.Demo01Exception;

/*
    throw关键字
    作用:
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式:
        throw new xxxException("异常产生的原因");
    注意:
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
        3.throw关键字抛出指定的异常对象,我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象,我们可以不处理,默认交给JVM处理(打印异常对象,中断程序)
            throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常,要么throws,要么try...catch
 */

public class Demo03Throw {


    public static void main(String[] args) {
        int arr[] = {2, 344, 54, 45, 54};
      //  arr=null;java.lang.NullPointerException: 传递的数组为null

        int value = getElement(arr, 5);//java.lang.ArrayIndexOutOfBoundsException: 数组索引超出数组的使用范围
        System.out.println(value);
        System.out.println(1);

    }
    /*
          定义一个方法,获取数组指定索引处的元素
          参数:
              int[] arr
              int index
          以后(工作中)我们首先必须对方法传递过来的参数进行合法性校验
          如果参数不合法,那么我们就必须使用抛出异常的方式,告知方法的调用者,传递的参数有问题
          注意:
              NullPointerException是一个运行期异常,我们不用处理,默认交给JVM处理
              ArrayIndexOutOfBoundsException是一个运行期异常,我们不用处理,默认交给JVM处理
          */
    private static int getElement(int[] arr, int index) {

     /*  我们可以对传递过来的数组参数进行合法性检验
          如果 数组为null，则抛出NullPinterExceptin异常

          */
        if (arr == null) {


         throw    new NullPointerException("传递的数组为null");
        }

     /*   我们可以对传递过来的数组索引参数进行校验
                如果数组的索引不在数组使用范围内，就抛出ArrayIndexOutOfBoundsExceptiinon*/

        if (index > arr.length - 1 || index < 0) {
          throw   new ArrayIndexOutOfBoundsException("数组索引超出数组的使用范围");

        }
        int value = arr[index];
        return value;
    }
}
