package PATYiJi;
import java.util.Scanner;

public class pat1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String strArray[] = new String[num];
		
		for(int i=0;i<num;i++) {
			strArray[i] = input.next();
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(YESORNO(strArray[i]));
			System.out.println(i + strArray[i]);
		}
	}
	
	public static String YESORNO(String str) {
		int P=0,A=0,T=0,LocP=0,LocT=0;
		for(int j=0;j<str.length();j++) {
			switch(str.charAt(j)) {
			case 'A' :
				A++;
				break;
			case 'P' :
				P++;
				LocP = j;
				break;
			case 'T' :
				T++;
				LocT = j;
				break;
			}
		}
		if(P+A+T == str.length() && A!=0 && P==1 && T==1 && LocT-LocP>1 && LocP*(LocT-LocP-1)==str.length()-LocT-1) {
			return "YES";
		}else {
			return "NO";
		}
	}

}
