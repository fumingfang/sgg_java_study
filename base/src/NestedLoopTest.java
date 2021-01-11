/**
 * @Author 扶明方
 * @Date 2021/1/11 20:16
 * @Version 1.0
 */
public class NestedLoopTest {
    public static void main(String[] args) {
        /**
         * 嵌套循环的使用
         * 1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
         * 2.外层循环：循环结构B。内层循环：循环结构A
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
