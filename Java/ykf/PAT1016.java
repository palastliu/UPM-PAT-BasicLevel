import java.util.Scanner;
public class PAT1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int DA = sc.nextInt();
		String B = sc.next();
		int DB = sc.nextInt();
		int totalA = 0;
		int totalB = 0;
		int m = 0;
		int o = 0;
		for(int i=0;i<A.length(); i++){
			if(A.charAt(i)-'0' == DA) {
				totalA += (int)Math.pow(10,m)* DA;
				m++;
			}
		}
		for(int i=0; i<B.length(); i++) {
			if(B.charAt(i)-'0' == DB) {
				totalB+= (int)DB * Math.pow(10,o);
				o++;
			}
		}
		System.out.print(totalA + totalB);
		
	}

}
