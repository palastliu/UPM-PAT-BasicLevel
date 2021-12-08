import java.util.Arrays;
import java.util.Scanner;
public class PAT1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		if(n.length()!=4) {
			  int b=4-n.length();
			  for(int i=0;i<b;i++) {
				  n="0"+n;
			  }
		  }
		char[] a = n.toCharArray();
		String r = "";
		while(!r.equals("6174")) {
			if(a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3]){
				 System.out.print(n+" - "+n+" = 0000");
				break;
			}
			r = String.valueOf(Integer.parseInt(desc(a))-Integer.parseInt(asc(a)));
			if(r.length()!=4) {
				 for(int i=0;i<4-r.length();i++) {
					  r="0"+r;
				  }
			}
			if(r.equals("6174")) {
				 System.out.print(desc(a)+" - "+asc(a)+" = "+r);
				  a=r.toCharArray();
			}
			else{
				  System.out.println(desc(a)+" - "+asc(a)+" = "+r);
				  a=r.toCharArray();
			}
			
			
		}
		
	}



	public static String asc(char []a) {
		Arrays.sort(a);
		return String.valueOf(a);
		//ÉýÐò 
	}
	
public static String desc(char[] a) {		
	 for(int i=0;i<a.length-1;i++) {
		   for(int m=0;m<a.length-i-1;m++) {
			   if(a[m+1]>a[m]) {
				   char temp=a[m+1];
				   a[m+1]=a[m];
				   a[m]=temp;
			   }
		   }
	    }
		return String.valueOf(a); 
		//½µÐò
	}

}

