package PATYiJi;
import java.util.Scanner;

public class pat1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String star = input.next();
		input.close();
		int max = 0;
		int need = 1;
		if(num>=1) {
			num -= 1;
			max = 1;
			need += 2;
		}
		while(num>=need*2) {
			num -= need*2;
			max++;
			need += 2;
		};
		
		for(int i=max;i>0;i--) {
			for(int j=0;j<max-i;j++) System.out.print(" "); 		//Êä³ö¿Õ¸ñ
			for(int j=0;j<i*2-1;j++) System.out.print(star);		//Êä³öÐÇÐÇ
			System.out.print("\n");
		}
		for(int i=1;i<max;i++) {
			for(int j=1;j<max-i;j++) System.out.print(" "); 		//Êä³ö¿Õ¸ñ
			for(int j=0;j<i*2+1;j++) System.out.print(star);		//Êä³öÐÇÐÇ
			System.out.print("\n");
		}
		System.out.println(num);
	}

}
