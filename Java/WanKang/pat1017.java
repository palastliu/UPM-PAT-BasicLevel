package PATYiJi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class pat1017 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] str = input.readLine().trim().split("\\s+");
		BigInteger A = new BigInteger(str[0]);
		BigInteger B = new BigInteger(str[1]);
		BigInteger Q = A.divide(B);
		BigInteger R = A.remainder(B);
		System.out.println(Q + " " + R);
	}

}
