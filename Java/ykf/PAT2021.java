import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PAT2021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r = br.readLine();
		char[] a = r.toCharArray();
		int[] result = new int[10];
		for(int i=0;i<r.length();i++) {
			result[a[i]-'0']++;
			}
		
		for (int i = 0; i < 10; i++) {
			if (result[i] != 0) {
				System.out.println(i + ":" + result[i]);
			}
		}
		}


		
	}


