package PATYiJi;
import java.util.Scanner;
import java.util.Arrays;

public class pat1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int end = input.nextInt();
		input.close();
		int[] arr = new int[4];
		
		do {
			for(int i=0;i<4;i++) {	//把num存到数组里
				arr[i] = end%10;
				end = end/10;
			}
			Arrays.sort(arr);		//得到三个数字
			int small = arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
			int big = arr[3]*1000 + arr[2]*100 + arr[1]*10 + arr[0];
			end = big - small;
			//输出
			System.out.printf("%04d - ", big);
            System.out.printf("%04d = ", small);
            System.out.printf("%04d\n", end);
		} while(end!=6174 && end!=0);
	}
	
}
