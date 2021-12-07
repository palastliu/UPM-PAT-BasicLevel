import java.util.Scanner;

public class PTA_1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.close();
		int i = 0;
		
		while (N!=1) {
		if (N % 2 == 0)
			N = N/2;
		else
			N = (3 * N + 1)/2;
		i++;
		}
		
		System.out.println(i);
		
		
	}

}
