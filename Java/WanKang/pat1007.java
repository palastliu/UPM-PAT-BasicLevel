package PATYiJi;
import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class pat1007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int c=0,sum=0,num=2;
        for (int i = 3; i <=N ; i++) {
            c=0;
            int i_sqrt = (int)sqrt(i);
            for (int j = 2; j <=i_sqrt ; j++) {
                if (i%j==0){
                    c++;
                    break;
                }
            }
            if (c==0){
                if (num+2==i){
                    sum++;
                }
                num=i;
            }
        }
        System.out.println(sum);
    }
}