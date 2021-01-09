
/**
 * @Author 扶明方
 * @Date 2021/1/7 18:05
 * @Version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
        System.out.println(4 > 3);//true
        System.out.println(4 < 3);//false
        System.out.println(4 <= 3);//false
        System.out.println(4 >= 3);//true
        System.out.println(4 == 3);//false
        System.out.println(4 != 3);//true
        System.out.println("hello" instanceof String);//true


        //思考
        boolean b1 = false;
        //区分==和=的区别
        if (b1 == true)
            System.out.println("结果为真");
        else
            System.out.println("结果为假");//假

        if (b1 = true)
            System.out.println("结果为真");//真
        else
            System.out.println("结果为假");
    }
}
