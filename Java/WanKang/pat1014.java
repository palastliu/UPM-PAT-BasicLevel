package PATYiJi;
import java.util.Scanner;

public class pat1014 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		String str3 = input.next();
		String str4 = input.next();
		input.close();
		String date[] = { "MON","TUE","WED","THU","FRI","SAT","SUN" };
		int time[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		System.out.print(date[Gfw(str1,str2)]+" ");
		System.out.printf("%02d:", time[Gsw(str1,str2)]);
		System.out.printf("%02d",getfz(str3 ,str4));
	}

	public static int Gfw(String str1,String str2){		
		int len1 = str1.length();
		for(int i=0;i<len1 ;i++){
			if(isUpcase(str1,i)){
				if(str1.charAt(i)==str2.charAt(i)){
					return str1.charAt(i)-65;
				}
			}
		}
		return 0;
	}

	public static int get(String str1 ,String str2){		
		int k = Gfw(str1,str2)+65;
		for(int i=0 ;i<str1.length() ;i++){
			if(str1.charAt(i)==k){
				return i;
			}
		}
		return 0;
	}

	public static int Gsw(String str1,String str2){		
		int len1 = str1.length();
		for(int i=get(str1 ,str2)+1;i<len1 ;i++){
			if(isNum(str1,i)){
				if(str1.charAt(i)==str2.charAt(i)){
					return str1.charAt(i)-48;
				}	
			}
			if(isUp2(str1,i)){
				if(str1.charAt(i)==str2.charAt(i)){
					return str1.charAt(i)-55;
				}
			}
		}
		return 0;
	}

	public static int getfz(String str1,String str2){			
		int len1 = str1.length();
		for(int i=0 ;i<len1 ;i++){
			if(iszimu(str1,i)){
				if(str1.charAt(i)==str2.charAt(i)){
					return i;
				}
			}
		}
		return 0;
	}

	public static boolean isUpcase(String str,int i){		
		if(str.charAt(i)>='A'&&str.charAt(i)<='G'){
			return true;
		}
		return false;
	}

	public static boolean isNum(String str,int i){
		if((str.charAt(i)>='0'&&str.charAt(i)<='9')){		
			return true;
		}
		return false;
	}
	public static boolean isUp2(String str,int i){
		if((str.charAt(i)>=65&&str.charAt(i)<=78)){		
			return true;
		}
		return false;
	}

	public static boolean iszimu(String str,int i){
		if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')){		
			return true;
		}
		return false;
	}

}