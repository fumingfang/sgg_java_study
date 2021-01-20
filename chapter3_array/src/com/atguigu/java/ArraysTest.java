package com.atguigu.java;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 扶明方
 * @Date 2021/1/18 14:18
 * @Version 1.0
 */
public class ArraysTest {
    /**
     * java.util.Arrays：操作数组的工具类，里面定义了很多操作数组的方法
     */
    public static void main(String[] args) {
        //1.boolean equals(int[] a, int[] b):判断两个数组是否相等
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 5, 3, 6};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println("arr1和arr2是否相等： " + isEquals);//false

        //2.String toString(int[] a)：输出数组信息
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4]

        //3.void fill(int[] a, int val)//将指定值填充到数组之中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));//[10, 10, 10, 10]


        //4.void sort(int[] a)：对指定数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.int binarySearch(int[] a, int key)：在数组中查找key，有则返回下标，无则返回负数
        //前提：数组是有序的
        int index = Arrays.binarySearch(arr2, 6);
        System.out.println("6在arr2中的下标为：" + index);//4

        //6.int[] copyOf(int[] a , int newLength)：复制数组
        int[] arr3 = Arrays.copyOf(arr2, 10);
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 5, 6, 0, 0, 0, 0, 0]

        double[] arr4 = new double[]{4.23, 4.56, 89.45};
        double[] arr5 = Arrays.copyOf(arr4, 10);
        System.out.println(Arrays.toString(arr5));//[4.23, 4.56, 89.45, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

        //7.List<T> asList(T... a)：返回一个受指定数组支持的固定大小的列表List
        String[] strArr = new String[]{"hello", "world"};
        List<String> list = Arrays.asList(strArr);
        System.out.println(list);//[hello, world]

    }
}
