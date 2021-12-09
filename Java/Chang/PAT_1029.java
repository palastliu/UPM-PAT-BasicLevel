import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAT_1029 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] yi = br.readLine().toUpperCase().split("");
        String[] er = br.readLine().toUpperCase().split("");
		
		
		String str="";
		
		for(int i=0;i<yi.length;i++) {
			boolean output=true;
			for(int j=0;j<er.length;j++) {
				if(yi[i].equals(er[j])) {
					output=false;
					break;
				}	
			}
			if(output) {
				boolean insert = str.contains(yi[i]);
				if(!insert) str+= yi[i];
				
			}		 
		}
		System.out.print(str);
	}
	
}
