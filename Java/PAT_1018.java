import java.util.Scanner;

public class PAT_1018 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       
        
        int q=0,w=0,e=0;
        String ws="";
        String ls="";
        for(int i=0;i<n;i++){
            String a=in.next();
            String b=in.next();
        	
        	if(a.equals("C")) {
        		if(b.equals("C")) {
        			w++;}	//平手
        		if(b.equals("J")) {
        			q++; 	
        			ws+="C";}	//甲赢锤子
        		if(b.equals("B")) {
        			e++;	
        			ls+="B";}	//乙赢布
        }
        	if(a.equals("J")) {
        		if(b.equals("J")) {
        			w++;}	//平手
        		if(b.equals("B")) {
        			q++; 	
        			ws+="J";}	//甲赢剪子
        		if(b.equals("C")) {
        			e++;	
        			ls+="C";}	//乙赢锤子
        }
        	if(a.equals("B")) {
        		if(b.equals("B")) {
        			w++;	}//平手
        		if(b.equals("C")) {
        			q++; 	
        			ws+="B";	}//甲赢锤子
        		if(b.equals("J")) {
        			e++;	
        			ls+="J";	}//乙赢剪子
        	
        		
        }
        
        }
        System.out.println(q+" "+w+" "+e);
        System.out.println(e+" "+w+" "+q);
        S(ws);
        System.out.print(" ");
        S(ls);
	}
	
	private static void S(String s) {
		int c=0,j=0,b=0;	//赢的次数
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='C') {
				c++;	}
			if(s.charAt(i)=='J') {
				j++;}
			if(s.charAt(i)=='B') {
				b++;}
		}
		 if(b>=c){
	            if(b>=j) 
	                System.out.print("B");
	            else
	                System.out.print("J");
	        }
	        else if(c>b){
	            if(c>=j)
	                System.out.print("C");
	            else
	                System.out.print("J");
	        }
	        else if(j>b){
	            if(j>c)
	                System.out.print("J");
	            else
	                System.out.print("C");
	        }
	
	}

}
