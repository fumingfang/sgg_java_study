package com.atguigu.exer;

/**
 * @Author 扶明方
 * @Date 2021/1/17 1:17
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        //求二维数组中所有数的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("二维数组元素的和：" + sum);
    }
}
