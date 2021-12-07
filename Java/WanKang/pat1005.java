package PATYiJi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class pat1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> num_a = new ArrayList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            num_a.add(num);
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    arrayList.add(num);
                } else {
                    num = (3 * num + 1) / 2;
                    arrayList.add(num);
                }
            }
        }
        for (int i =0; i<n; i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if(i<num_a.size()) {
                    if (arrayList.get(j) == num_a.get(i)) {
                        num_a.remove(i);
                        i=0;
                    }
                }
            }
        }
        Collections.sort(num_a);
        Collections.reverse(num_a);
        for(int i=0;i<num_a.size();i++){
            if (i<num_a.size()-1)
            System.out.print(num_a.get(i)+" ");
            else System.out.println(num_a.get(i));
        }
    }
}