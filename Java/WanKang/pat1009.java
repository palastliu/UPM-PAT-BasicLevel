package PATYiJi;
import java.util.Scanner;

public class pat1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] word = text.split(" ");
		
		for(int i=word.length-1;i>0;i--) {
			System.out.print(word[i] + " ");
		}
		System.out.print(word[0] + "\n");
	}

}
