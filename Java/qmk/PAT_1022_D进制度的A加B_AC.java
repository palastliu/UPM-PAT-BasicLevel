import java.util.Scanner;

public class PAT_1022_D进制度的A加B_AC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(),D=sc.nextInt();
        sc.close();
        if(D>1 && D<=10)
            System.out.println(Integer.toString((A+B),D));
    }
}
