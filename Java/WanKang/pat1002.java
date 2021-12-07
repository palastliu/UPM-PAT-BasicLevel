package PATYiJi;
import java.util.Scanner;

public class pat1002{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] ping = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		String num = input.next();
		int sum = 0;
		
		for(int i=0;i<num.length();i++) {
			sum += num.charAt(i) - 48;
		}
		
		String sumStr = sum + "";
		
		for(int i=0;i<sumStr.length()-1;i++) {
			System.out.print(ping[sumStr.charAt(i)-48] + " ");
		}
		System.out.print(ping[sumStr.charAt(sumStr.length()-1)-48]);
	}

}
