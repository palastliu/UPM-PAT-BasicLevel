package PATYiJi;
import java.io.*;
import java.math.BigDecimal;

public class pat1024 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		BigDecimal num = new BigDecimal(str);
		System.out.print(num.toPlainString() + "\n");
	}

}
