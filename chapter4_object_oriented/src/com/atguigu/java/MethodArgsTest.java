package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/22 16:47
 * @Version 1.0
 * @Desc 可变个数的形参的方法
 * 1.jdk5.0新增的内容
 * 2.具体使用：
 * 格式：数据类型... 变量名
 * 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 * 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。换句话说，二者不能共存
 * 可变个数形参在方法的形参中，必须声明在末尾
 * 可变个数形参在方法的形参中，最多只能声明一个可变形参
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("hello", "world");//[Ljava.lang.String;@1b6d3586
    }

    public void show(int i) {
        System.out.println(i);
    }

    public void show(String s) {
        System.out.println(s);
    }

    public void show(String... strs) {
        System.out.println(strs);
    }

    /*public void show(String[] strs) {
        System.out.println(strs);
    }*/
}
