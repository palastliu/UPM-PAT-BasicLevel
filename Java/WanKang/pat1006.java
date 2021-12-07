package PATYiJi;
import java.util.Scanner;

public class pat1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number(100-999): ");
		int num = input.nextInt();
		input.close();

		int numB = num/100;
		num = num%100;
		int numS = num/10;
		num = num%10;
		
		String output = "";
		for(int i=0;i<numB;i++) {
			output = output + "B";
		}
		for(int i=0;i<numS;i++) {
			output = output + "S";
		}
		for(int i=1;i<num+1;i++) {
			output = output + i;
		}
		System.out.println(output);
		
	}

}
