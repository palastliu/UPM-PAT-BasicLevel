package PATYiJi;
import java.io.*;

public class pat1018 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine().trim());
		int winA=0, winB=0, draw=0;	//用来记录两人胜利次数
		int JA=0, BA=0, CA=0, JB=0, BB=0, CB=0; 		//记录胜利方法
		for(int i=0;i<n;i++) {
			String play = input.readLine();
			switch(play) {
			case "J J":
				draw++;
				break;
			case "C C":
				draw++;
				break;
			case "B B":
				draw++;
				break;
			case "J C":
				winB++;
				CB++;
				break;
			case "J B":
				JA++;
				winA++;
				break;
			case "C B":
				BB++;
				winB++;
				break;
			case "C J":
				CA++;
				winA++;
				break;
			case "B J":
				JB++;
				winB++;
				break;
			case "B C":
				BA++;
				winA++;
				break;
			}
		}
		char A = 'B', B = 'B';	//判断 输出 BCJ
		if(CA>BA) {
			A = 'C';
			if(JA>CA) A = 'J';
		}else if(JA>BA) A = 'J';
		if(CB>BB) {
			B = 'C';
			if(JB>CB) B = 'J';
		}else if(JB>BB) B = 'J';
		
		//输出
		System.out.print(winA + " " + draw + " " + winB + "\n");
		System.out.print(winB + " " + draw + " " + winA + "\n");
		System.out.print(A + " " + B + "\n");
	}

}
