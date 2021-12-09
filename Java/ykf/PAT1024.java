import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
public class PAT1024 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		BigDecimal bd = new BigDecimal(input);
		System.out.print(bd.toPlainString());	
		
	}

}
