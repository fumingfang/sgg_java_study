package com.atguigu.java;

import java.util.Arrays;

/**
 * @Author 扶明方
 * @Date 2021/1/22 17:18
 * @Version 1.0
 * @Desc 关于变量的值传递
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        ValueTransferTest test = new ValueTransferTest();
        /*int i = 2;
        test.test(i);
        System.out.println("i等于：" + i);
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("传入fillArr方法前：");
        System.out.println(Arrays.toString(arr));
        test.fillArr(arr);
        System.out.println("传入fillArr方法后：");
        System.out.println(Arrays.toString(arr));*/

        int m = 10;
        int n = 20;
        test.swap(m, n);//数据值的传递
        System.out.println("m = " + m + ",n = " + n);//交换不成功


        Data data = new Data();
        data.m = 10;
        data.n = 20;
        test.swap(data);//地址值的传递
        System.out.println("m = " + data.m + ",n = " + data.n);//交换成功
    }

   /* public void test(int i) {
        i = 100;
        System.out.println(i);
    }

    public void fillArr(int[] arr) {
        Arrays.fill(arr, 6);
    }*/

    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data {
    int m;
    int n;
}
