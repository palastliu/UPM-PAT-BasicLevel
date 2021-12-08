package PATYiJi;
import java.util.Scanner;

public class pat1026 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int C1 = input.nextInt();
		int C2 = input.nextInt();
		input.close();
		int sec = (int)((C2 - C1) * 1.0 / 100 + 0.5);
		System.out.printf("%02d:%02d:%02d\n", sec / 3600, sec / 60 % 60, sec % 60);
	}
}