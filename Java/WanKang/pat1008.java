package PATYiJi;
import java.util.Scanner;

public class pat1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		// get array
		int a[] = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = input.nextInt();
		}
		
		MoveArray(a, M);
		for(int i=0;i<N-1;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[N-1] + "\n");
	}
	
	public static int[] MoveArray(int a[], int M) {
		for(int i = 0; i < M; i++){
			int temp = a[a.length-1];
			for(int j = a.length-1; j > 0; j--){
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
		return a;
	}

}
