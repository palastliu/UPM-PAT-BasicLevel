import java.util.Scanner;

public class APT_1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int d = input.nextInt();
		input.close();
		
		int sum = a+b;
		if (d == 2) {
			System.out.println(Integer.toBinaryString(sum));
		}
		else if(d==3){
			System.out.println(Integer.toString(sum, 3));			
		}
		else if(d==4){
			System.out.println(Integer.toString(sum, 4));			
		}
		else if(d==5){
			System.out.println(Integer.toString(sum, 5));			
		}
		else if(d==6){
			System.out.println(Integer.toString(sum, 6));			
		}
		else if(d==7){
			System.out.println(Integer.toString(sum, 7));			
		}
		else if(d==8){
			System.out.println(Integer.toOctalString(sum));
		}
		else if(d==9){
			System.out.println(Integer.toString(sum, 9));			
		}
		else if(d==10){
			System.out.println(sum);
		}
	}

}
