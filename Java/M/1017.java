import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] str = input.readLine().split(" ");
		BigInteger a,b;
		a = new BigInteger(str[0]);
		b = new BigInteger(str[1]);
		System.out.print(a.divide(b)+" "+a.remainder(b));
	}
}