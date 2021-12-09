package PATYiJi;
import java.io.*;

public class pat10322 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[][] arr = new int[N][2];
		int schoolNum = 0;
		for(int i=0;i<N;i++) {
			String[] temp = input.readLine().trim().split("\\s+");
			int school = Integer.parseInt(temp[0]);
			int score = Integer.parseInt(temp[1]);
			if(school>schoolNum) schoolNum = school;
			arr[i][0] = school;
			arr[i][1] = score;
		}
		
		int[] score = new int[schoolNum];
		for(int i=0;i<N;i++) score[arr[i][0]-1] += arr[i][1];
		
		int max = 0;
		int loc = -1;
		for(int i=0;i<schoolNum;i++) if(score[i]>max) {
			max = score[i];
			loc = i+1;
		}
		
		System.out.println(loc + " " + max);
	}

}
