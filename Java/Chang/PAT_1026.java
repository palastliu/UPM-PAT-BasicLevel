import java.util.Scanner;
public class PAT_1026 {
	
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner in=new Scanner(System.in);
	        int c1=in.nextInt();
	        int c2 = in.nextInt();
	        in.close();
	        int sec = (int)((c2-c1)*1.0/100+0.5);
	        System.out.printf("%02d:%02d:%02d", sec/3600,sec/60%60,sec%60);
	        
	    }
}