import java.util.Arrays;
import java.util.Scanner;

public class PAT_1019 {
    int []nArray;
    int output,minN,maxN;

    public  PAT_1019() {
        Scanner input = new Scanner(System.in);
        output = input.nextInt();
        input.close();

        nArray= new int[4];

        do {
            step();
        }while(output!=6174 && output!=0);

    }

    private void step(){
        for (int i = 0; i < 4; i++) {
            nArray[i] = output % 10;
            output /= 10;
        }
        Arrays.sort(nArray);
        minN=maxN=0;
        for (int i = 0; i < 4; i++) {
            minN = minN * 10 + nArray[i];
        }
        for (int i = 3; i >= 0; i--) {
            maxN = maxN * 10 + nArray[i];
        }
        output = maxN - minN;
        print();
    }

    private void print(){
        if(0==output)
            System.out.println(maxN+" - "+minN+" = 0000");
        else{
            System.out.printf("%04d - ", maxN);
            System.out.printf("%04d = ",minN);
            System.out.printf("%04d\n", output);
        }
    }

    public static void main(String[] args) {
        new PAT_1019();
    }
}
