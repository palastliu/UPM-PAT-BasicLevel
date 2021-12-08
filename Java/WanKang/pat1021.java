package PATYiJi;
import java.util.Scanner;

public class pat1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String num = input.next();
		input.close();
		int[] cha = new int[10];
		for(int i=0;i<num.length();i++) cha[num.charAt(i) - '0']++;
		for(int i=0;i<10;i++) if(cha[i]!=0) System.out.print(i + ":" + cha[i] + "\n");
	}

}
