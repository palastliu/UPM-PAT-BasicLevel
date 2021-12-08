import java.util.Scanner;

public class PAT_1023_组个最小数_AC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        int min=9;

        for(int i=0;i<10;i++)
            list[i]=input.nextInt();

        for(int i=1;i<10;i++){      //找最小值 :开头
                if(i<min && list[i]!=0)
                    min=i;
        }
            System.out.print(min);
            list[min]--;

        while(list[0]!=0){                //print 0
                System.out.print(0);
                list[0]--;
        }

        for(int j=1; j<10;j++){        //0以外的数
            while(list[j]!=0){
                    System.out.print(j);
                    list[j]--;
                }
            }
        }

    }
