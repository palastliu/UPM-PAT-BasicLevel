import java.util.Scanner;

public class _1002_写出这个数 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        String number = input.next();
        int zz = Integer.valueOf(number).intValue();
        if(zz<Math.pow(10,100)) {


            int sum = 0;

            for (int i = 0; i < number.length(); i++) {
                sum += number.charAt(i) - '0';
            }


            int bai = sum / 100;   // num=398, 398/100=3.98, bai=3
            int shi = (sum % 100) / 10; // 398%100= 98, 98/10=9.8, shi=9
            int ge = ((sum % 100) % 10) / 1; // 98%10= 8


            String[] stringArray = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};

            if (bai != 0)
                System.out.print(stringArray[bai] + " ");
            if (shi != 0 ||  bai != 0)
                System.out.print(stringArray[shi] + " ");
            if (ge != 0 || shi != 0)
                System.out.print(stringArray[ge]);
        }
    }
}
