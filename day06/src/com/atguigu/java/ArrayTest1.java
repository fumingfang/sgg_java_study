package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/15 16:34
 * @Version 1.0
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        //数组元素的默认初始化值
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);//null
        }
        System.out.println("*********");

        int[] ids = new int[5];
        //数组元素的默认初始化值
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);//0
        }
        System.out.println("*********");

        double[] doubles = new double[5];
        //数组元素的默认初始化值
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);//0.0
        }
        System.out.println("*********");

        char[] chars = new char[5];
        //数组元素的默认初始化值
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);//(char)0
        }
        System.out.println("*********");
        System.out.println( "***" + (char)0 + "***");

        boolean[] booleans = new boolean[5];
        //数组元素的默认初始化值
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);//false
        }
        System.out.println("*********");


    }
}
