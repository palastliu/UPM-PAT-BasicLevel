import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PAT1023 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			a[i] = Integer.parseInt(input[i]);
		}
		System.out.print(count(a));
	}
	
	public static String count(int[] a) {
		StringBuffer sb=new StringBuffer();
		if(a[0]!=0) {
			int i =1;
			while(a[i]==0) {
				i++;
			}
			sb.append(i);
			a[i]--;
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<a[i];j++) {
				sb.append(i);
			}
		}
		return sb.toString();
	}
}
	
	

