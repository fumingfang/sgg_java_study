import java.util.Scanner;

/**
 * @Author 扶明方
 * @Date 2021/1/11 19:57
 * @Version 1.0
 */
public class DeadLoopTest {
    public static void main(String[] args) {
        //从键盘读入个数不确定的整数，并判断读入的整数和负数的个数，输入为0时程序结束。
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("请输入：");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                System.out.println(num + "是正数");
            } else {
                System.out.println(num + "是负数");
            }
        }
    }
}

