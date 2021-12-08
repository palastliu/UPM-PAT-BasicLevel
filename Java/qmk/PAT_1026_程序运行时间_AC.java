import java.util.Scanner;

public class PAT_1026_程序运行时间_AC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double time1 =sc.nextDouble();
        double time2 = sc.nextDouble();      //此处用double是为了后续方便计算
        int seconds = (int)(
                (time2-time1)/100+0.5);      //四舍五入
        System.out.printf("%02d:%02d:%02d",
                seconds/3600,
                seconds/60%60,seconds%60);    //注意格式要求
    }
}
