import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class PAT_1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");

        BigInteger A,B,Q,R;
        //Scanner sc =new Scanner(System.in);
        A=new BigInteger(str[0]);
        B=new BigInteger(str[1]);
        Q = A.divide(B);
        R = A.remainder(B);
        System.out.println(Q+" "+ R);
    }
}
