package com.atguigu.java;

/**
 * @Author 扶明方
 * @Date 2021/1/20 18:39
 * @Version 1.0
 * @desc 类中属性的使用
 *        属性(成员变量) vs 局部变量
 *        1.相同点
 *          1.1 定义变量的格式是一样的：数据类型 变量名 = 变量值;
 *          1.2 先声明，后使用
 *          1.3 变量都有其对应的作用域
 *
 *
 *        2.不同点
 *          2.1在类中声明的位置不同
 *              属性：直接定义在一对{}内
 *              局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 *          2.2关于权限修饰符的不同
*               属性：可以在声明属性时，指明其权限，使用权限修饰符
 *                      常见的权限修饰符：public、default、protected、private   --> 封装性
 *              局部变量：不可以使用权限修饰符
 *          2.3默认初始化值的情况
 *              属性：类的属性，根据其类型，都有默认初始化值
 *              局部变量：没有默认初始化值，所以在调用局部变量之前，一定要显式赋值
 *          2.4在内存中加载的位置
 *              属性：加载到堆空间中（非static）
 *              局部变量：加载到栈空间
 */
public class UserTest {

}

class User {
    String name;
    int age;

    public void talk(String language) {//language：形参，也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {
        String food = "烙饼";//局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}
