package PATYiJi;
import java.util.Scanner;

public class pat1010 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split("\\s+");
		StringBuffer result = new StringBuffer();
		for(int i = 0;i<split.length;i+=2){
 
			//系数非0指数为0
			if(Integer.parseInt(split[i+1]) == 0 && Integer.parseInt(split[i]) != 0 ){
				continue;
			}
 
			//系数为0
			if(Integer.parseInt(split[i]) == 0){
				result.append(0+" ");
				result.append(0+" ");
				continue;
			}
 
			//普通情况
			result.append(Integer.parseInt(split[i])*Integer.parseInt(split[i+1])+" "+(Integer.parseInt(split[i+1])-1)+" ");
		}
		if(result.length() == 0){//空串时输出0 0
			System.out.print("0 0");
		}else{
			System.out.print(result.substring(0, result.length()-1));
		}
	}
}