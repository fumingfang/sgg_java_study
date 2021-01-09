import java.util.Scanner;

/**
 * @Author 扶明方
 * @Date 2021/1/8 20:43
 * @Version 1.0
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();  //从键盘获取数字
        System.out.println(num);
        String str = scanner.next();//从键盘获取字符串
        System.out.println(str);
    }
}
