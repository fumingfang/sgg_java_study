package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/21 14:35
 * @Version 1.0
 * @Desc 类中方法的声明和使用
 * <p>
 * 方法：描述类应该具有的功能
 * 比如：Math类：sqrt()\random()
 * Scanner类：nextXXX()
 * Arrays类：sort()\binarySearch()\toString()\equals()\fill()\asList()\copyOf()
 *
 * 举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 *
 * 方法的声明：
 * 权限修饰符 返回值类型 方法名(形参列表){
 *     方法体;
 * }
 * 注意：static、final、abstract来修饰的方法，后面再讲
 *
 * 说明：
 *      权限修饰符：public、protected、default、private  -->封装性再细说
 *      返回值类型：
 *          有返回值：如果方法有返回值，则必须在方法声明时指定返回值的类型。同时，方法中需要使用return关键字来返回指定类型的变量或常量："return 数据;"
 *          无返回值：如果方法没有返回值，使用void来表示。通常没有返回值的方法中，就不需要使用return，但是如果使用的话只能"return;"表示结束此方法的意思
 *      方法名：属于标识符，遵循标识符的规则和规范，见名知意
 *      形参列表：方法可以声明0个，1个，或多个形参。
 *          格式：数据类型1 形参1, 数据类型2 形参2, ....
 *      方法体： 方法功能的体现
 *      return关键字的使用：
 *          使用范围：使用在方法体内
 *          作用：结束方法
 *                针对有返回值类型的方法，使用"return 数据;"的方法返回所要的数据
 *          注意点：return关键字后面不可以声明执行语句（与break、continue关键字一样）
 *      方法的使用：可以调用当前类的属性或方法
 *          特殊的：方法A中又调用了方法A：递归方法
 *          注意：方法中不能再定义方法
 */

//客户类
public class CustomerTest {

    //属性
    String name;
    int age;
    boolean isMale;

    public static void main(String[] args) {
        CustomerTest customer = new CustomerTest();
    }
    //方法
    public void eat() {
        System.out.println("客户吃饭");
        return;
//        System.out.println("hahahh");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是" + nation;
        return info;
    }
}
