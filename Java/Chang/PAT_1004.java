import java.util.Scanner;

public class PAT_1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String [][]str=new String[N][3];
		int highest=-1, lowest=10000;
		int highestLoc = 0, lowestLoc = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<3;j++) {
				str[i][j]=input.next();
				if(j==2) {
					int score = Integer.parseInt(str[i][j]);
					if(score>highest) {
						highestLoc = i;
						highest = score;
					}
					if(score<lowest) {
						lowestLoc = i;
						lowest = score;					
					}
				}
			}
		}		
		System.out.println(str[highestLoc][0] + " " + str[highestLoc][1]);
		System.out.println(str[lowestLoc][0] + " " + str[lowestLoc][1]);	
	}
}