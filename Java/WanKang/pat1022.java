package PATYiJi;
import java.util.Scanner;

public class pat1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int base = input.nextInt();
		input.close();
		if(base>1 && base<=10) {
			int num = A + B;
			System.out.print(Integer.toString(num, base));
		}
	}

}
