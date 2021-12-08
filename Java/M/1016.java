import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a =String.valueOf(sc.nextInt());
		int num = sc.nextInt();
		String a2 =String.valueOf(sc.nextInt());
		int num2 = sc.nextInt();
		System.out.print(Integer.parseInt(calc(a,num)) + Integer.parseInt(calc(a2,num2)));
	}
	public static String calc(String a, int num) {
		String n = "";
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == (char)(num+48)) {
				n += num+"";
			}
		}
		if(n.length()>0)
			return n;
		else
			return 0+"";
	}
}