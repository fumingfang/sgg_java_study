package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/22 15:52
 * @Version 1.0
 * @Desc 方法的重载
 * <p>
 * 重载的概念：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可
 * 两同一不同：同一个类，相同方法名
 * 参数列表不同：参数个数不同，参数类型不同
 *
 * 重载的特点：与返回值类型无关，只看参数列表，且参数列表必须不同。（参数个数或参数类型）。调用时，根据方法参数列表的不同来区别。
 * 举例：Arrays工具类中的sort()方法、binarySearch()方法等
 *
 *
 */
public class OverloadTest {
    public static void main(String[] args) {


    }
    //以下几种方法即为方法的重载
    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double i, double j) {
        System.out.println(i + j);
    }

    public void getSum(String i, String j) {
        System.out.println(i + j);
    }
}
