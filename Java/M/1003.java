import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[Integer.parseInt(in.readLine().trim())];
		for (int i = 0; i < array.length; i++) {
			array[i] = in.readLine().trim();
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(YN(array[i]));
		}
	}
	public static String YN(String str) {
		String p1 = "A*PA+TA*";
		String p2 = "PA+T";
		if(str.matches(p1)) {
			if(str.matches(p2)) {
				return "YES";
			}else {
				String[] temp = str.split("P|T");
				if(temp[2].length() == temp[0].length()*temp[1].length())
					return "YES";
				else
					return "NO";
			}
		}else {
			return "NO";
		}
	}
}
