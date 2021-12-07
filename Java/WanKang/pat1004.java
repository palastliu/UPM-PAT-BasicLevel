package PATYiJi;
import java.util.Scanner;

public class pat1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String a[][] = new String[num][3];
		int highest=-1, lowest=10000;
		int highestLoc = 0, lowestLoc = 0;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = input.next();
				if(j==2) {
					int score = Integer.parseInt(a[i][j]);
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
		
		System.out.println(a[highestLoc][0] + " " + a[highestLoc][1]);
		System.out.println(a[lowestLoc][0] + " " + a[lowestLoc][1]);
	}

}
