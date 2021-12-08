
import java.util.Scanner;


    public class PAT_1021_个位数统计 {
        //一道虽简单，却引人深思的题

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String number = input.next();
            int count[] = new int[10];
            int length = number.length();

            //灵活使用数字，尽可能减少 Array 的使用，以防头秃眼花
            for (int i = 0; i < length; i++) {
                count[number.charAt(i) - '0']++;
            }

            ////不要总死磕一个完整的输出，要灵活我哭！！直接 if 掉不需要的不就行了！！
            //啊啊啊啊啊为什么我总爱死磕！！
            for (int i = 0; i < 10; i++) {
                if (count[i] != 0) {
                    System.out.println(i + ":" + count[i]);
                }
            }

        }
    }


