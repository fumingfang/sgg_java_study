/**
 * @Author 扶明方
 * @Date 2021/1/11 19:42
 * @Version 1.0
 */
public class DoWhileLoopTest {
    /**
     * do - while循环结构的使用
     * 循环结构的4个要素
     * ①初始化条件
     * ②循环条件 -->是boolean类型
     * ③循环体
     * ④迭代部分
     * <p>
     * do - while循环的结构
     * ①
     * do {
     * ③
     * ④
     * }while(②)
     *
     * <p>
     * 执行过程：①、③、④、②、③、④、。。。。、②
     */
    public static void main(String[] args) {
        //遍历100以内的偶数
        int num = 1;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        } while (num <= 100);
    }
}
