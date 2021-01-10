/**
 * @Author 扶明方
 * @Date 2021/1/10 1:04
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        String str = "1";
        //swictch中的表达式只能是以下6中数据类型之一：byte 、short 、char 、 int 、 枚举类型（JDK5.0新增）、 String类型（JDK7.0新增）
        switch (str) {
            case "是": {
                System.out.println("str : 是");
                break;//如果不写break，则会继续向下执行，知道遇到break
            }
            case "否": {
                System.out.println("str : 否");
                break;
            }
            default: {
                System.out.println("都不匹配");
            }
        }

        int num = 10;
        switch (num / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }
    }
}
