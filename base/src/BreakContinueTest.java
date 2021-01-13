/**
 * @Author 扶明方
 * @Date 2021/1/12 11:55
 * @Version 1.0
 */
public class BreakContinueTest {
    /**
     * break: 使用范围switch - case结构、
     * 循环结构，结束当前循环
     * continue: 使用范围循环结构，结束当次循环，继续下一轮循环
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 4 == 0) {
                //break;//123
                continue;//1235679
            }
            System.out.print(i);
        }
        System.out.println("\n");

        foo:for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
//                    break foo;
                    continue foo;
                }
                System.out.print(j);
            }
        }
    }
}
