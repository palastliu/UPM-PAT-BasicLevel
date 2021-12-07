/** 
* Score: 15/15
* Run Time: 80ms
* Memory: 21900KB
*/


import java.util.Scanner;

public class _1001_Guess3n{
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();             //输入一个正整数number
        int counter =0;                           //计算总步数counter

        while(number!=1){                         //若不为1，进入loop;换句话说，直到number=1,结束loop;
            if(number%2==0){
                number=number/2;                   //number为偶数，取其一半
            }
            else 
                number = (3 * number + 1) / 2;       //反之，取其3N+1的一半
            counter++;
        }

        System.out.println(counter);
    }
}
