import java.util.Scanner;

public class PAT1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String c = input.next();
		input.close();
		
		int hang = (int)Math.round(n/2.0);
		for(int j=1;j<=hang;j++) {
			if (j==1 || j==hang) {		
			for(int i=0;i<n;i++) {
				System.out.print(c);		
			}
			System.out.println();
			}else {
			System.out.print(c);
			for(int k=0;k<n-2;k++) {
				System.out.print(" ");
			}
			System.out.println(c);
			}
		}
	}
}