package PATYiJi;
import java.io.*;

public class pat10302 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] n = input.readLine().trim().split("\\s+");
		int N = Integer.parseInt(n[0]);
		int p = Integer.parseInt(n[1]);
		String[] str = input.readLine().trim().split("\\s+");
		int[] num = new int[N];
		int max = 0;
		for(int i=0;i<N;i++) {
			num[i]=Integer.parseInt(str[i]);	//把数据读取成 int 数组；
			if(num[i]>max) max = num[i];		//找到最大值M；
		}
		
		int account = 0;
		for(int i=0;i<N;i++) if(num[i]*p >= max) account++;
		System.out.println(account);
	}

}
