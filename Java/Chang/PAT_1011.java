import java.math.BigInteger;
import java.util.Scanner;

public class PAT_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = input.nextInt();
		for(int i=0;i<total;i++) {
			BigInteger a = input.nextBigInteger();
			BigInteger b = input.nextBigInteger();
			BigInteger c = input.nextBigInteger();
			input.nextLine();
			BigInteger sum = a.add(b);
		
			if(sum.compareTo(c)>0) 
				System.out.println("Case #"+(i+1)+": true");
				else
					System.out.println("Case #"+(i+1)+": false");
		
			
		}
	}

}
