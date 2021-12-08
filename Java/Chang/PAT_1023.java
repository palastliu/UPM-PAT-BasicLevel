import java.util.Scanner;

public class PAT_1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] num = new int[10];
				
		
		for(int i=0;i<10;i++)  
			num[i] = input.nextInt();//存入数组
			
		boolean b = true;
		for(int m=1;m<10;m++) {
			if(num[m]>0 && b==true) {
				System.out.print(m);//输出第一个数字大于0
				b=false;
				if(num[0]>0) {
					for(int j=0;j<num[0];j++) {
						System.out.print("0");//如果有0输出0
				}
			}
			for(int k=1;k<num[m];k++) {
				System.out.print(m);//继续输出最小的没输出过的数字
			}
			}else if(num[m]>0) {
				for(int l=0;l<num[m];l++)
					System.out.print(m);
			}
		}		
	}
}
