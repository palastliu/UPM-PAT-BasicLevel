import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAT_1009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
		
		String[] strs = str.split(" ");
		
		for(int i=strs.length;i>1;i--) {
			if(i>0) {
			System.out.print(strs[i-1]+" ");
			}
		}
		System.out.println(strs[0]);
	}

}
