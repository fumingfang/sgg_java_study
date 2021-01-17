package com.atguigu.exer;

/**
 * @Author 扶明方
 * @Date 2021/1/17 1:39
 */
public class YangHuiSanJiao {
    public static void main(String[] args) {
        //打印10行杨辉三角
        //1.声明及初始化二维数组
        int[][] yangHui = new int[10][];

        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];//第i行有i+1个元素
            yangHui[i][0] = 1;//首位和末位都是1
            yangHui[i][i] = 1;
//            for (int j = 1; j < yangHui.length - 1; j++) {
            for (int j = 1; j < i; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }

        //遍历输出
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
