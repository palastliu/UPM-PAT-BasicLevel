package PATYiJi;
import java.util.Scanner;

public class pat1013 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int j=1,k=0;
        for(int i=2;k<n;i++){
            if(isPrime(i)){
                k++;
                if(k>=m){
                    if(j%10==0){
                        System.out.println(" "+i);
                    }else if(j%10==1){
                        System.out.print(i);
                    }else{
                        System.out.print(" "+i);
                    }
                    j++;
                }
            }
        }
    }
    public static boolean isPrime(int x){
        if(x<=3)
            return true;
        for(int i=2;i<=(int)Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}

