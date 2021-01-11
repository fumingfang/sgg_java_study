
/**
 * @Author 扶明方
 * @Date 2021/1/11 17:17
 * @Version 1.0
 */
public class ForLoopTest {
    /**
     * For循环结构的使用
     * 循环结构的4个要素
     * ①初始化条件
     * ②循环条件 -->是boolean类型
     * ③循环体
     * ④迭代部分
     * <p>
     * for循环的结构
     * for(①,②,④) {
     * ③
     * }
     * <p>
     * 执行过程：①、②、③、④、②、③、④、。。。。、②
     */
    public static void main(String[] args) {
        int i = 1;
        for (System.out.print("a"); i <= 3; System.out.print("c"), i++) {
            System.out.print("b");
        }
    }
}
