package PATYiJi;
import java.io.*;

public class pat1031 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		
		int total = 0;
		String[] str = new String[N];
		for(int i=0;i<N;i++) {
			String ID = input.readLine();
			if(checkID(ID) != true) {
				total++;
				str[i] = ID;
			}else str[i] = "";
		}
		
		if(total==0) System.out.println("All passed");
		else {
			for(int i=0;i<N;i++) {
				if(!str[i].isEmpty()) System.out.println(str[i]);
			}
		}
	}
	
	public static boolean checkID(String ID) {
		int[] data = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		String[] M = {"1","0","X","9","8","7","6","5","4","3","2"};
		int sum = 0;
		for(int i=0;i<17;i++) sum += (ID.charAt(i) - '0') * data[i];	//ËãºÍ
		String checkChar = M[sum%11];
		String lastChar = String.valueOf(ID.charAt(17));
		if(checkChar.equals(lastChar)) return true;
		else return false;
	}

}
