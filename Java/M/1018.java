import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine().trim());
		int win = 0, equ = 0, lost = 0; 
		int aB = 0, aC = 0, aJ = 0, bB = 0, bC = 0, bJ = 0;
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			al.add(new String(in.readLine()));
			if(al.get(i).equals("J J")|| al.get(i).equals("B B") ||al.get(i).equals("C C")) {
				equ++;
			}else {
				if(al.get(i).equals("C J")||al.get(i).equals("J B")||al.get(i).equals("B C")) {
					win++;
					if(al.get(i).charAt(0)=='C')aC++;
					else if(al.get(i).charAt(0)=='B')aB++;
					else aJ++;
				}else {
					lost++;
					if(al.get(i).charAt(2)=='C')bC++;
					else if(al.get(i).charAt(2)=='B')bB++;
					else bJ++;
				}
			}
		}
		System.out.println(win+" "+equ+" "+lost);
		System.out.println(lost+" "+equ+" "+win);
		System.out.print(calc(aB, aC, aJ)+" "+calc(bB, bC, bJ));
	}
	public static char calc(int b, int c, int j) {
		if (b>=c) {
			return (b >= j) ? 'B' : 'J';
		}else{
			return (c >= j) ? 'C' : 'J';
		}
	}
}