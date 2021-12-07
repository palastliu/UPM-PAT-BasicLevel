import java.util.Scanner;

public class _1001_Guess3n{
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter =0;

        while(number!=1){
            if(number%2==0){
                number=number/2;
            }
            else 
                number = (3 * number + 1) / 2;
            counter++;
        }

        System.out.println(counter);
    }
}
