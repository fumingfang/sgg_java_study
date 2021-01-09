import javax.sound.midi.Soundbank;

/**
 * @Author 扶明方
 * @Date 2021/1/7 19:59
 * @Version 1.0
 */
public class BitTest {
    public static void main(String[] args) {
        //位运算符操作的都是整形的数据
        //<<：在一定范围内，每向左移一位，相当于 * 2
        //>>：在一定范围内，每向右移一位，相当于 / 2
        System.out.println(6 << 2); //24
        System.out.println(6 >> 2); //1
        System.out.println(6 & 3); //2
        System.out.println(6 | 3); //7
        System.out.println(6 ^ 3); //5

        //取反操作
        System.out.println(~6);//-7
        System.out.println(~7);//-8
        System.out.println(~-7);//6

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        //方式1：定义临时变量的方式
        /*int temp = num1;
        num1 = num2;
        num2 = temp;*/
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方式2:好处：不同定义临时变量
        //弊端：①相加操作可能超出存储范围 ②有局限性：只能适用于数值类型
        /*num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;*/
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方式三：使用位运算符
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
    }
}
