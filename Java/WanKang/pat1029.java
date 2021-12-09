package PATYiJi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pat1029 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] str1 = input.readLine().toUpperCase().split("");
		String[] str2 = input.readLine().toUpperCase().split("");
		input.close();
		
		String str = "";				// 存储输出的值
		for(int i=0;i<str1.length;i++) {
			boolean output = true;
			for(int j=0;j<str2.length;j++) {
				if(str1[i].equals(str2[j])) {
					output = false;
					break;
				}
			}
			if(output) {
				boolean insert = str.contains(str1[i]);		//判断是否重复
				if(!insert) str += str1[i];
			}
		}
		
		System.out.println(str);
	}

}
