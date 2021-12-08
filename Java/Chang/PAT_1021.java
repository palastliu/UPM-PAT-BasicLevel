import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAT_1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        char[] array = str.toCharArray();
        int[] arrInt = new int[10];
        for(int i=0;i<array.length;i++) {
        	arrInt[array[i]-'0']++;
        }
        	
        for(int j=0;j<arrInt.length;j++) {
        	if(arrInt[j]!=0)
        	System.out.println(j+":"+arrInt[j]);
        }   
	}
}