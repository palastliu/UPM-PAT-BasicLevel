import java.util.Scanner;

public class PAT_1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[]p=input.next().split("[.]");
		String[]a=input.next().split("[.]");
		input.close();
		
		int[]p1 = new int[3];
		int[]a1 = new int[3];
		int[]output = new int[3];				
		for(int i=0;i<p.length;i++) {
			p1[i]=Integer.valueOf(p[i]);
			a1[i]=Integer.valueOf(a[i]);		//存入数据转成数组
		}
		
		if(a1[0]>=p1[0]) {
			if(a1[2]>=p1[2]) {						//29个[2]=1个[1],17个[1]=1个[0]
				output[2] = a1[2]-p1[2];
			}else {
				a1[1]-=1;
				output[2] = (a1[2]+29)-p1[2];}
				
			if(a1[1]>=p1[1]) {						
				output[1] = a1[1]-p1[1];
			}else {
				a1[0]-=1;
				output[1] = (a1[1]+17)-p1[1];}
			
				output[0] = a1[0]-p1[0];
				System.out.println(output[0]+"."+output[1]+"."+output[2]);
		}else {
			if(p1[2]>=a1[2]) {						//29个[2]=1个[1],17个[1]=1个[0]
				output[2] = p1[2]-a1[2];
			}else {
				p1[1]-=1;
				output[2] = (p1[2]+29)-a1[2];}
				
			if(p1[1]>=a1[1]) {						
				output[1] = p1[1]-a1[1];
			}else {
				p1[0]-=1;
				output[1] = (p1[1]+17)-a1[1];}
			
				output[0] = p1[0]-a1[0];
				System.out.println("-"+output[0]+"."+output[1]+"."+output[2]);
		}					
	}
}
