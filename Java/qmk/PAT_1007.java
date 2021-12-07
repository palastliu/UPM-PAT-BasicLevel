import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PAT_1007 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(input.readLine());
        if(N<Math.pow(10,5)) {
            int counter = 0;

            if (N > 2) {
                for (int i = 3; i < N; i++) {
                    if (isPrime(i) && isPrime(i - 2))
                        counter++;
                }
            }
            System.out.println(counter);
        }

    }

    public static boolean isPrime(int x){
        boolean isPrime=true;
        if(x == 1)
            isPrime=false;
        else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}


