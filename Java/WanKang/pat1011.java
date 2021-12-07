package PATYiJi;
import java.util.Scanner;

public class pat1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		long a[][] = new long[num][3];
		for(int i=0;i<num;i++) {
			a[i][0] = input.nextInt();
			a[i][1] = input.nextInt();
			a[i][2] = input.nextInt();
		}
		boolean outcome[] = AB_biger_than_C(a);
		
		for(int i=0;i<outcome.length;i++) {
			int x = i+1;
			if(outcome[i]==true) System.out.println("Case #" + x + ": true");
			else System.out.println("Case #" + x + ": false");
		}
		
	}
	
	public static boolean[] AB_biger_than_C(long a[][]) {
		boolean boo[] = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i][0] + a[i][1] > a[i][2]) boo[i] = true;
			else boo[i] = false;
		}
		return boo;
	}

}