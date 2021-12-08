import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int step = 0;
		while(n != 1) {
			step++;
			n = calc(n);
		}
		System.out.print(step);
	}
	public static int calc(int n) {
		return (n%2==0) ? n/2 : (3*n + 1)/2;
	}
}