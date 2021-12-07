import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PAT1018test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total  = Integer.parseInt(br.readLine());
		String [] result = {"B","C","J"};
		int win = 0;
		int lose = 0;
		int draw = 0;
		int [] J = new int[3];
		int [] Y = new int[3];
		for(int i=0;i<total;i++) {
			char []list = br.readLine().toCharArray();
			if((list[0]=='C'&&list[2]=='J')||(list[0]=='J'&&list[2]=='B')||(list[0]=='B'&&list[2]=='C')){
                win++;
                if(list[0]=='B')
                J[0]++;
                if(list[0]=='C')
                J[1]++;
                if(list[0]=='J')
                J[2]++;
            }else if((list[0]=='C'&&list[2]=='B')||(list[0]=='J'&&list[2]=='C')||(list[0]=='B'&&list[2]=='J')){
                lose++; 
                if(list[2]=='B')
                Y[0]++;
                if(list[2]=='C')
                Y[1]++;
                if(list[2]=='J')
                Y[2]++;
            }
            else draw++; 
        }
		
		System.out.println(win+" "+draw+" "+lose);
		System.out.println(lose+" "+draw+" "+win);
		System.out.println(result[Max(0,J)]+" "+result[Max(0,Y)]);
		}
		
		public static int Max(int max, int [] Player) {
			
			for(int i=1;i<3;++i){
	            if(Player[i]>Player[max])
	            max=i;
	        }
			return max;
		}
	}


