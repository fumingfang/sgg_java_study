/**
 * @Author 扶明方
 * @Date 2021/1/7 19:21
 * @Version 1.0
 */
public class LogicTest {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        //逻辑与
        System.out.println(a & b);//false
        //短路与
        System.out.println(a && b);//false
        //逻辑或
        System.out.println(a | b);//true
        //短路或
        System.out.println(a || b);//true
        //逻非
        System.out.println(!a);//false
        //逻辑异或
        System.out.println(a ^ b); //true


        //区分 & 与&&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) { //b2为false，则不再计算后面的布尔值，直接为false
            System.out.println("真");
        } else {
            System.out.println("假");
        }
        System.out.println("num2 = " + num2);
    }
}
