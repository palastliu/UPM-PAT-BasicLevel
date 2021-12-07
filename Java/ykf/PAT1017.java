import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PAT1017 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String[] s= br.readLine().split(" ");
		BigInteger A = new BigInteger(s[0]);
		BigInteger B = new BigInteger(s[1]);
		BigInteger Q = null;
		BigInteger R = null;
		
		Q = A.divide(B);
		R = A.remainder(B);
		System.out.print(Q+ " "+ R);
	}

}




//A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立