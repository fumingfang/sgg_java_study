import java.util.Scanner;

/**
 * @Author 扶明方
 * @Date 2021/1/8 20:43
 * @Version 1.0
 */
public class ScannerTest {
    public static void main(String[] args) {
        //Scanner类的实例化
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();  //从键盘获取数字
        System.out.println(num);
//        String str = scanner.next();//从键盘获取字符串
//        System.out.println(str);
        if (num >= 90) {
            System.out.println("大于等于90");
        } else if (num >= 80) {
            System.out.println("大于等于80小于90");
        } else if (num >= 60){
            System.out.println("大于等于60小于80");
        } else {
            System.out.println("小于60");
        }
    }
}
