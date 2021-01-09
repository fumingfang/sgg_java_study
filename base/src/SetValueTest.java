/**
 * @Author 扶明方
 * @Date 2021/1/7 14:50
 * @Version 1.0
 */
public class SetValueTest {
    public static void main(String[] args) {
        //赋值符号 ： =
        int i1 = 10;
        int j1 = 20;

        System.out.println(i1 = j1);  //20

        //连续赋值
        int i2, j2;
        i2 = j2 = 10;


        //+=  -= *= /= %=
        int num1 = 10;
        num1 += 2;  //num1 = num1 + 2
        System.out.println(num1);

        short num2 = 10;
        num2 += 2;// 不会改变变量本身类型
        System.out.println(num2);


        //练习1
        int i = 1;
        i *= 0.1;
        System.out.println(i);  //0   不会改变数据类型
        i++;
        System.out.println(1);  //1

        //练习2
        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m = " + m);  //3
        System.out.println("n = " + n);  //6

        //练习3
        int n1 = 10;
        n1 += (n1++) + (++n1);  //n1 = n1 + ((n1++) + (++n1))
        System.out.println(n1);  //32

    }
}
