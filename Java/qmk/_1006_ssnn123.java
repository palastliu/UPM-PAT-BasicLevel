import java.util.ArrayList;
import java.util.Scanner;

public class _1006_ssnn123 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        String number = input.next();

        int ge = 0;
        int shi=0;
        int bai = 0;

       if(number.length() == 3) {
           bai =number.charAt(0)-'0';
           shi =number.charAt(1)-'0';
           ge = number.charAt(2)-'0';
       }
       else if(number.length()==2){
           shi =number.charAt(0)-'0';
           ge = number.charAt(1)-'0';
       }
        else
            ge = number.charAt(0)-'0';


       String output = "";

        for(int i=0;i<bai;i++) output += "B";
        for(int i=0;i<shi;i++) output += "S";
        for(int i=1;i<ge+1;i++) output += i;

        System.out.println(output);
    }
}
