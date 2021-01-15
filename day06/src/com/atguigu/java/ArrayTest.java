package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/15 15:43
 * @Version 1.0
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] ids;//数组的声明
        //静态初始化：数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        //调用数组的指定位置的元素：通过下标的方式调用
        System.out.println(ids[2]);
        //获取数组的长度
        System.out.println("ids数组的长度：" + ids.length);

        //动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[4];

        //遍历数组元素
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        System.out.println("********************************8");
        //二维数组的静态初始化
        int[][] arr1 = new int[][]{{1,2,3}, {4,5}, {7,8,9}};//二维数组的声明及初始化
        //int[] arr1[] = new int[][]{{1,2,3}, {4,5}, {7,8,9}};//这样也正确


        //二维数组的动态初始化1
        String[][] arr2 = new String[3][2];
        //二维数组的动态初始化2
        String[][] arr3 = new String[3][];


    }

}
