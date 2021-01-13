/**
 * @Author 扶明方
 * @Date 2021/1/12 11:32
 * @Version 1.0
 */
public class PrimeNumberTest {
    public static void main(String[] args) {
        //输出100以内的所有质数
        boolean isFlag = true;
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {//优化2
                if (i % j == 0) {
                    isFlag = false;
                    break;//优化一
                }
            }
            if (isFlag) {
                System.out.println(i);
                count++;
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数为：" + count);
        System.out.println("时间为：" + (end - start));
    }
}
