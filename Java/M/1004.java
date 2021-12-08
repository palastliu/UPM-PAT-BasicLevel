import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	String name;
	String metric;
	int score;
	public Main(String name, String metric, int score) {
		this.name = name;
		this.metric = metric;
		this.score = score;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Main[] list = new Main[Integer.parseInt(in.readLine().trim())];
		for (int i = 0; i < list.length; i++) {
			String[] s = in.readLine().trim().split(" ");
			list[i] = new Main(s[0], s[1], Integer.parseInt(s[2]));
		}
		sort(list);
		System.out.println(list[0].name+" "+list[0].metric);
		System.out.print(list[list.length-1].name+" "+list[list.length-1].metric);
	}
	public static void sort(Main[] list) {
		for (int i = 0; i < list.length - 1; i++) {
	        for (int j = 0; j < list.length - 1 - i; j++) {
	            if (list[j].score < list[j+1].score) {
	            	Main temp = list[j+1];
	            	list[j+1] = list[j];
	            	list[j] = temp;
	            }
	        }
	    }
	}
}
