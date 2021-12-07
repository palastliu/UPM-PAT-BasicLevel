import java.util.Arrays;
import java.util.Scanner;
public class PAT1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int ac = 0;
		int aj = 0;
		int ab = 0;
		int bc = 0;
		int bj = 0;
		int bb = 0;
		int draw = 0;
		for(int i=0; i<total;i++) {
			char A = sc.next().charAt(0);
			char B = sc.next().charAt(0);
			sc.nextLine();
			if(A=='C'&& B=='J') {
				ac++;
				
			}
			
			else if(A=='C'&& B=='B') {
				bb++;
				
			}
			
			else if(A=='C'&&B=='C') {
				draw++;
			}
			
			else if(A=='J'&&B=='C') {
				bc++;
			}
			
			else if(A=='J'&&B=='J') {
				draw++;
			}
			else if(A=='J'&&B=='B') {
				aj++;
			}
			else if(A=='B'&&B=='C') {
				ab++;
			}
			else if(A=='B'&&B=='J') {
				bj++;
			}
			else if(A=='B'&&B=='B') {
				draw++;
			}
		}
		int Alose = total-ac-aj-ab-draw;
		int Blose = total-bc-bj-bb-draw;
		int Awin = total-draw-Alose;
		int Bwin = total-draw-Blose;
		System.out.println(Awin+" "+ draw+" "+ Alose);
		System.out.println(Bwin+" "+ draw+" "+ Blose);
		System.out.println(getMaxA(ac,aj,ab,draw,total)+" "+getMaxA(bc,bj,bb,draw,total));
	}
	public static String getMaxA(int c, int j, int b,int draw,int total) {
		int []list = {b,c,j};
		String use = "";
		if(list[0]>=list[1]&& list[0]>=list[2]){
			use = "B";
		}else if(list[1]>=list[2]){
			use = "C";
		}else{
			use = "J";
		}
		return use;
	}
	
}







//输入第 1 行给出正整数 N（≤10^5），即双方交锋的次数。随后 N 行，每行给出一次交锋的信息，
//即甲、乙双方同时给出的的手势。C 代表“锤子”、J 代表“剪刀”、B 代表“布”，第 1 个字母代表
//甲方，第 2 个代表乙方，中间有 1 个空格。