package PATYiJi;
import java.io.*;

public class pat10282 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(input.readLine());
		
		String max = "";
		String min = "";
		int minage = 201;
		int maxage = -1;
		int total = 0;
		for(int i=0;i<num;i++) {
			String[] str = input.readLine().trim().split(" |/");
			int year = Integer.parseInt(str[1]);
			int month = Integer.parseInt(str[2]);
			int day = Integer.parseInt(str[3]);
			if(birth(year,month,day)) {
				total++;
				int age = 2014-year;
				if(maxage<age) {
					maxage = age;
					max = str[0];
				}
				if(minage>age) {
					minage = age;
					min = str[0];
				}
			}
		}
		if(total>0) System.out.println(total + " " + max + " " + min);
		else System.out.println("0");
		
	}
	
	public static boolean birth(int year, int month, int day) {
		if(year>1815 && year<2014) return true;
		if (year == 1814) {
			if (month > 9) return true;
			if (month == 9) if (day >= 6) return true;
			return false;
		}
		if (year == 2014) {
			if (month < 9) return true;
			if (month == 9) if (day <= 6) return true;
			return false;
		}
		return false;
	}
}
