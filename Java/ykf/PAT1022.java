import java.util.Scanner;
public class PAT1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		System.out.print(Integer.toString(A+B, D));
	}

}
