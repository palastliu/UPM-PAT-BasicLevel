import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class PAT_1024 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		BigDecimal num = new BigDecimal(str);
		System.out.print(num.toPlainString() + "\n");
	}
}