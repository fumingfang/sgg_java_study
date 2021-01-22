package com.atguigu.exer;

/**
 * @Author 扶明方
 * @Date 2021/1/21 16:09
 * @Version 1.0
 * @Desc 利用面向对象的编程方法，设计类Circle计算圆的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius =3;
        System.out.println("圆得面积为：" + circle.calArea());
    }
}

//圆类
class Circle {
    double radius;//圆的半径
     /**
      * @Description:
      * @Author: fumf
      * @Date: 2021/1/21 17:46
      * @return: 面积
      **/
    public double calArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
