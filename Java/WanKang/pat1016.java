package PATYiJi;
import java.util.Scanner;

public class pat1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String A = input.next();
		int DA = input.nextInt();
		String B = input.next();
		int DB = input.nextInt();
		//Ñ­»·¼ÆÊý
		int outA = 0;
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i) - '0' == DA) {
				outA = outA*10 + DA;
			}
		}
		int outB = 0;
		for(int i=0;i<B.length();i++) {
			if(B.charAt(i) - '0' == DB) {
				outB = outB*10 + DB;
			}
		}
		
		int out = outA + outB;
		System.out.println(out);
	}

}
