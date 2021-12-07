import java.util.Scanner;

public class PTA_1002 {		
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	String str = input.next();
	input.close();
	int sum = 0;
	
	for(int i=0; i<str.length(); i++) {
		sum += Integer.parseInt(str.substring(i, i+1));
	}
	
	String s = String.valueOf(sum);	
	for(int i=0;i<s.length();i++) {
		int x = Integer.parseInt(s.substring(i, i+1));
		if (x==0)
			System.out.print("ling");
		if (x==1)
			System.out.print("yi");
		if (x==2)
			System.out.print("er");
		if (x==3)
			System.out.print("san");
		if (x==4)
			System.out.print("si");
		if (x==5)
			System.out.print("wu");
		if (x==6)
			System.out.print("liu");
		if (x==7)
			System.out.print("qi");
		if (x==8)
			System.out.print("ba");
		if (x==9)
			System.out.println("jiu");
		
		if(i != s.length()-1)
			System.out.print(" ");
		
	}
	
	
}

}
