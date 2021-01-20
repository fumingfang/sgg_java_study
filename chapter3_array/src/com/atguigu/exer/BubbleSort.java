package com.atguigu.exer;

/**
 * @Author 扶明方
 * @Date 2021/1/17 17:41
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-345, 34, 76, 234, -13, 0, 678, 98, 45, 0};
        /**
         * arr.length : 10
         * 总共需要9轮
         * 第一轮：9次
         * 第二轮：8次
         * 。。。
         * 第九轮：1次
         */
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {//控制轮数
            for (int j = 0; j < arr.length - 1 - i; j++) {//控制每一轮判断的次数
                //按从小到大排序
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
