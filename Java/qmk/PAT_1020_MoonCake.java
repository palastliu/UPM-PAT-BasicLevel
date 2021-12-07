import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PAT_1020_MoonCake {

              //用Collections类的sort方法对ArrayList 进行排序
    static class MoonCake implements Comparable<MoonCake>{
              //自定义排序方式需要有类来实现Comparable接口并重写compareTo方法

        double totalPrice,amount,price;    //注意输入的是总价，单价需要再计算

        MoonCake(double amount, double totalPrice, double price){
            this.amount=amount;
            this.totalPrice=totalPrice;
            this.price=price;
        }
        public int compareTo(MoonCake Object){     //自定义：单价按降序排序
            return price > Object.price ? -1:1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(
                new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
                                             //输入 空格 计为一次录入

        int inventory =Integer.parseInt(input[0]);
        int maxDemanded = Integer.parseInt(input[1]);

        String[] readAmount = br.readLine().split(" "),
                readTotalPrice = br.readLine().split(" ");
                                  //注意此处录入为 上下两行 同时录入

        ArrayList<MoonCake> list = new ArrayList<>();

        for(int i =0; i<inventory; i++){      //对总价、月饼数量进行录入
            double amount = Double.parseDouble(readAmount[i]);
            double totalPrice = Double.parseDouble(readTotalPrice[i]);
            double price = totalPrice/amount;
            list.add(new MoonCake(amount,totalPrice,price));
        }

        double maxIncome=0;

        Collections.sort(list);   //对list中的元素，按照上述自定义方式排序

        while(maxDemanded!=0){              // 需求量不为0 时进行loop
            for(int i=0; i<inventory;i++){      //每类产品Loop一次

                if(list.get(i).amount<=maxDemanded){
                        //若此类月饼 库存 <= 剩余需求量，此类全部卖掉；需求量-；
                    maxIncome += list.get(i).amount * list.get(i).price;
                    maxDemanded -= list.get(i).amount;
                }
                else {   //反之，卖掉需求量的部分；需求量=0；
                    maxIncome += list.get(i).price * maxDemanded;
                    maxDemanded = 0;
                    break;
                }
            }
        }
        System.out.printf("%.2f", maxIncome);  //结果保留两位小数
    }
}
