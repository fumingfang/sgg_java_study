package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/18 20:54
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的结构：属性和方法
        //调用属性： 对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);//Tom
        System.out.println(p1.age);//0  默认初始化值


        //调用方法：对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("中文");
    }

}

class Person {
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话，使用的是" + language);
    }
}
