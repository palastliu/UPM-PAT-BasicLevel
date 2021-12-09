import java.util.Scanner;

public class PAT_1027_打印沙漏_AC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char signal =sc.next().charAt(0);
        int maxLayer=3;
        int k=n-1;
        int top;

        while(k>=maxLayer*2){                       //计算最大行的行数
            k=k-(maxLayer*2);
            maxLayer+=2;
        }
        maxLayer-=2;

        top=maxLayer;
        while(top>0){                   //上面的漏斗
            printSignal(signal,top,maxLayer);
            n-=top;
            top-=2;
            System.out.println();
        }

        top=3;
        while(top<=maxLayer){            //下面的漏斗
            printSignal(signal,top,maxLayer);
            n-=top;
            top+=2;
            System.out.println();
        }

        System.out.println(n);
    }

    private static void printSignal(char c, int x, int max) {
        for(int i =0; i<(max-x)/2;i++)   //每行前面的空格也要print!岂可修！
            System.out.print(" ");

        for(int i=0;i<x;i++)
            System.out.print(c);  //后面的空行我差点也给print了，我是傻逼
    }
}


