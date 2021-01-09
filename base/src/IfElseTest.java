import javax.sound.midi.Soundbank;

/**
 * @Author 扶明方
 * @Date 2021/1/8 17:50
 * @Version 1.0
 */
public class IfElseTest {
    public static void main(String[] args) {
        //第一种
        int num = 10;
        if (num > 0) {
            System.out.println("num > 0");
        }
        System.out.println("num < 0");

        //第二种
        int score = 90;
        if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        //第三种
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }


    }
}
