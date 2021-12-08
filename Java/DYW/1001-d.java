import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        int n=0;
        Scanner Scanner=new Scanner(System.in);//接受扫描键盘输入信息
        int a=Scanner.nextInt();
        while(a!=1){
            
            if(a%2==0){
                a=a/2;
                n++;
        }
            else{
                a=3*a+1;
                a=a/2;
                n++;
            }
        }
        System.out.println(n);
    }
    
    }
