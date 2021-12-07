import java.util.Scanner;

public class PAT_1016 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String A = input.next();
        int Da= input.nextInt();
        String B = input.next();
        int Db= input.nextInt();
        int Pa=0, Pb=0;

        for(int i=0; i<A.length();i++){
            if(A.charAt(i)-'0'==Da)
                Pa=Pa*10+Da;
        }

        for(int i=0; i<B.length();i++){
            if(B.charAt(i)-'0'==Db)
                Pb=Pb*10+Db;
        }

        System.out.println(Pa+Pb);
    }
}
