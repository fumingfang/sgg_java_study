/**
 * @Author 扶明方
 * @Date 2021/1/11 19:28
 * @Version 1.0
 */
public class WhileLoopTest {
    /**
     * while循环结构的使用
     * 循环结构的4个要素
     * ①初始化条件
     * ②循环条件 -->是boolean类型
     * ③循环体
     * ④迭代部分
     * <p>
     * while循环的结构
     * ①
     * while(②) {
     * ③
     * ④
     * }
     * <p>
     * 执行过程：①、②、③、④、②、③、④、。。。。、②
     */
    public static void main(String[] args) {
        //遍历100以内的所有偶数
        int i = 1;//初始化条件
        while (i <= 100) {//循环条件
            if (i % 2 == 0) {//循环体
                System.out.println(i);
            }
            i++;//迭代条件
        }
    }
}
