package com.atguigu.exer;

import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @Author 扶明方
 * @Date 2021/1/17 2:02
 */
public class HuiXingShu {
    public static void main(String[] args) {
        //输入一个大于等于1的整数，输出回行数矩阵
        System.out.println("请输入一个大于等于1的数：");
        int n = new Scanner(System.in).nextInt();
        int[][] A = new int[n][n];

        //给元素赋值
        int t = 1;
        int i = 0, j = 0;//i表示行数，j表示列数
        for (int k = 0; k < n / 2; k++) {//k代表第几圈
            for (i = k, j = k; j < n - k - 1; j++) {//第一条边
                A[i][j] = t++;
            }
            for (i = k, j = n - k - 1; i < n - k - 1; i++) {//第二条边
                A[i][j] = t++;
            }
            for (i = n - k - 1, j = n - k - 1; j > k; j--) {//第三条边
                A[i][j] = t++;
            }
            for (i = n - k - 1, j = k; i > k; i--) {//第四条边
                A[i][j] = t++;
            }
        }
        if (n % 2 == 1) {
            A[n / 2][n / 2] = t;
        }
        //遍历输出
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
