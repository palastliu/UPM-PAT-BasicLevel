import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PAT_1017 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
		
		String[] strs = str.split(" ");
		
		BigInteger A, B, Q, R;
		A = new BigInteger(strs[0]);
		B = new BigInteger(strs[1]);
		Q= A.divide(B);
		R= A.mod(B);
		System.out.println(Q + " " + R);
	
	}

}
