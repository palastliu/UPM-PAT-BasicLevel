import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n = in.readLine().trim();
        in.close();
		if(Integer.parseInt(n)%1111==0) {
			System.out.print(n+" - "+n+" = 0000");
		}else {
			do {
	            String a=setOrder(calc(n),1);
				String b=setOrder(calc(n),0);
				n = String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
				System.out.printf("%04d - %04d = %04d\n", Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(n));
			}while(!n.equals("6174"));
		}
	}
	public static int[] calc(String num) {
		int[] order = {0,0,0,0};
		for(int i = 0; i < 4; i++) {
			order[i] = (int)num.charAt(i)-48;
		}
		return order;
	}
	public static String setOrder(int[] order, int way) {
		Arrays.sort(order);
		if(way==0)
			return order[0]+""+order[1]+""+order[2]+""+order[3];
		else
			return order[3]+""+order[2]+""+order[1]+""+order[0];
	}
}