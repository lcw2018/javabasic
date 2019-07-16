package cn.lcw.Set.Demo5;

public class ChangeArgs {


    public static void main(String[] args) {

        int arr[] = {2, 554, 434, 34, 5};
        int sum1 = getSum1(arr);
        System.out.println(sum1);

        int sum2 = getSum2(arr);
        System.out.println(sum2);


    }


    private static int getSum1(int... temp) {
        int sum = 0;
        for (int num : temp
                ) {
            sum += num;
        }

        return sum;
    }

    private static int getSum2(int[] temp) {
        int sum = 0;
        for (int num : temp
                ) {
            sum += num;
        }

        return sum;
    }


}
