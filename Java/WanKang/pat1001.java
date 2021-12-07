package PATYiJi;
import java.util.Scanner;

public class pat1001{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number (2-999): ");
        int num = input.nextInt();
        input.close();
        int times = 0;
        
        while(num>1){
            if(num%2 != 0){
                num = num*3 + 1;
                num = num/2;
                times++;
            }
            if(num%2 == 0){
            	num = num/2;
                times++;
            }
        }
        
        System.out.print(times);
    }
}