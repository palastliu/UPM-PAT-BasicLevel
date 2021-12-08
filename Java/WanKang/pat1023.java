package PATYiJi;
import java.util.Scanner;
import java.util.Arrays;

public class pat1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		int total = 0;
		for(int i=0;i<10;i++) {
			num[i] = input.nextInt();
			total += num[i];
		}
		if(total>50) {
			System.exit(0);		//如果总数超过50，终止程序
		}
		
		for(int i=1;i<10;i++) {				//跳过0从1开始找数字 输出第一个数字
			if(num[i]!=0) {
				System.out.print(i);
				num[i]--;					//减去一次
				break;
			}
		}
		
		for(int i=0;i<10;i++) for(int j=0;j<num[i];j++) System.out.print(i);
	}

}
