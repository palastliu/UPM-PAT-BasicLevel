import java.util.Scanner;

public class PAT_1039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		char[]a=str.toCharArray();
		String str2=input.next();
		char[]b=str2.toCharArray();
		input.close();
			
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					a[j]='*';
					break;
				}
			}
		}
		int count=0, r=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]=='*') {
				count++;
			}
		}
		if(count==b.length) {
			r=a.length-count;
			System.out.println("Yes "+r);
		}else {
			r=b.length-count;
			System.out.println("No "+r);
		}
		
	}

}
