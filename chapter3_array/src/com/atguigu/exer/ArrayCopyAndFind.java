package com.atguigu.exer;

import javafx.animation.RotateTransition;

/**
 * @Author 扶明方
 * @Date 2021/1/17 2:48
 */
public class ArrayCopyAndFind {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 3, 456, 73, 45, 463, 2, 3, 45};
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int[] arr3 = new int[arr.length];
        System.out.print("输出arr：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //复制数组
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.print("复制arr:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //反转数组
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("反转arr：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //线性查找
        int desc = 456;
        boolean find = false;
        for (int i = 0; i < arr.length; i++) {
            if (desc == arr[i]) {
                System.out.println(desc + "在arr数组的下标为" + i);
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("线性查找未找到" + desc);
        }

        //二分法查找 前提：有序
        arr = new int[]{1, 3, 6, 45, 65, 78, 89, 99, 200};
        desc = 99;
        int head = 0;
        int end = arr.length - 1;
        boolean erflag = false;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (desc == arr[middle]) {
                System.out.println("二分法查找找到了" + desc + "位置在：" + middle);
                erflag = true;
                break;
            } else if (arr[middle] > desc) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (!erflag) {
            System.out.println("二分法未找到" + desc);
        }
    }
}
