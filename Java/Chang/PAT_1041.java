import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAT_1041 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		long[][] arrayList = new long[n][3];
		for(int i=0;i<arrayList.length;i++) {
			String[]line = br.readLine().split(" ");
			arrayList[i][0]=Long.valueOf(line[0]);
			arrayList[i][1]=Long.valueOf(line[1]);
			arrayList[i][2]=Long.valueOf(line[2]);
		}
		int m = Integer.valueOf(br.readLine());
		String []seatNo = br.readLine().split(" ");		//´æÈëÊý¾Ý
		
		for(int i=0;i<m;i++) {
			int a = Integer.valueOf(seatNo[i]);
			for(int j=0;j<arrayList.length;j++) {
				if(a==arrayList[j][1]) {
					System.out.println(arrayList[j][0]+" "+arrayList[j][2]);
					break;
				}	
			}	
		}	
	}
}