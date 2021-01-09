/**
 * @Author 扶明方
 * @Date 2021/1/6 14:42
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "扶明方"; //用三个char保存
        System.out.println(str);

        //练习1
        char c = 'a'; //97
        int num = 10;
        String str2 = "hello";
        System.out.println(c + num + str2);  //107hello
        System.out.println(c + str2 + num);  //ahello10
        System.out.println(c + (num + str2));//a10hello
        System.out.println(str2 + num + c);  //hello10a

        //练习2 输出*   *
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');  //93 字符之间是加法运算
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");  //51*
        System.out.println('*' + ('\t' + "*"));
    }
}
