import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] num = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		char[] array = in.readLine().trim().toCharArray();
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += (int)array[i]-48;
		}
		for (int i = 0; i < (sum+"").length(); i++) {
			if(i < (sum+"").length()-1)
				System.out.print(num[(int)(sum+"").charAt(i)-48]+" ");
			else
				System.out.print(num[(int)(sum+"").charAt(i)-48]);
		}
	}
}