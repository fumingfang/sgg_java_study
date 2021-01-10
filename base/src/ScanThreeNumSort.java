import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Author 扶明方
 * @Date 2021/1/9 23:50
 */
public class ScanThreeNumSort {
    public static void main(String[] args) {
        //scanner类的实例化
        Scanner scanner = new Scanner(System.in);
        //输入三个整数，排序输出
        System.out.println("输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("输入第二个数：");
        int num2 = scanner.nextInt();
        System.out.println("输入第三个数：");
        int num3 = scanner.nextInt();
        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else {
            if (num3 >= num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else if (num3 <= num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
    }
}
