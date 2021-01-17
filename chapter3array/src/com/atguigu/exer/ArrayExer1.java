package com.atguigu.exer;

/**
 * @Author 扶明方
 * @Date 2021/1/17 2:30
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        //定义一个10个两位数整数的数组，求最大值、最小值、平均值、综合
        int[] arr = new int[10];
        int sum = 0;
        int max = 0;
        int min = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            //随机赋值一个两位数
            arr[i] = (int) (Math.random() * 90 + 10);
            if (i == 0) {
                min = arr[i];
            }
            sum += arr[i];//求总和
            //求最大值、最小值
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        avg = sum / 10;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("和：" + sum);
        System.out.println("平均值：" + avg);
    }
}
