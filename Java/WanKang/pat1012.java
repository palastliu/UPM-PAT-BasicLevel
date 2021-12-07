package PATYiJi;
import java.util.Scanner;
import java.text.DecimalFormat;

public class pat1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num[] = new int[n];
		//把数据转换成int型
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
		} 
		input.close();
		
		boolean a2 = false;
		boolean plus2 = true;
		int sum1 = 0, sum2 = 0;
		double sum4 = 0.0;
		int count3 = 0, count4 = 0;
		int highest5 = 0;
		for(int i=0;i<num.length;i++) {
			int remain = num[i]%5;
			switch(remain) {
			case 0:
				if(num[i]%2==0) sum1 += num[i];
				break;
			case 1:
				a2 = true;
				if(plus2) {
					sum2 += num[i];
					plus2 = false;
				}
				else {
					sum2 -= num[i];
					plus2 = true;
				} 
				break;
			case 2:
				count3++;
				break;
			case 3:
				sum4 += num[i];
				count4++;
				break;
			case 4:
				if(num[i]>highest5) highest5 = num[i];
				break;
			}
		}
		
		if(sum1==0) System.out.print("N");
		else System.out.print(sum1);
		System.out.print(" ");
		if(a2==false) System.out.print("N");
		else System.out.print(sum2);
		System.out.print(" ");
		if(count3==0) System.out.print("N");
		else System.out.print(count3);
		System.out.print(" ");
		if(count4==0) System.out.print("N");
		else {
			DecimalFormat df=new DecimalFormat("0.0");
			double ave = sum4/count4;
			System.out.print(df.format(ave));
		}
		System.out.print(" ");
		if(highest5==0) System.out.print("N");
		else System.out.print(highest5 + "\n");
	}

}
