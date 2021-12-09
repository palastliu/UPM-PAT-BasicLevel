package PATYiJi;
import java.io.*;

public class pat10332 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] key = input.readLine().trim().split("");
		String[] str = input.readLine().trim().split("");
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<key.length;j++) {
				String chara = key[j];
				try {										//防止报错
					chara = chara.toLowerCase();			//去除小写字母
				} catch(Exception ex) {}
				if(str[i].equals(chara)) str[i] = "ABC";	// 只要大于一个字符就可以
			}
		}
		
		boolean haveCaps = true;
		for(int i=0;i<key.length;i++) if(key[i].equals("+")) {
			haveCaps = false;
			break;
		}
		if(haveCaps) {
			for(int i=0;i<str.length;i++) if(str[i].length() == 1) System.out.print(str[i]);
		}
		else {
			for(int i=0;i<str.length;i++) if(str[i].length() == 1) {
				int chara = str[i].charAt(0);
				if(chara>'Z' || chara<'A') System.out.print(str[i]);	//防止输出大写
			}
		}
	}

}
