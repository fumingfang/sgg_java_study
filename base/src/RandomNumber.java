/**
 * @Author 扶明方
 * @Date 2021/1/10 0:27
 */
public class RandomNumber {
    public static void main(String[] args) {
        //获取一定范围内的随机数 Math.random [0.0 , 1.0) 大于等于0.0 小于1.0
        //获取 [10,20]范围内的整数
        int num = (int) (Math.random() * (20 - 10 + 1) + 10);
        System.out.println(num);
    }
}
