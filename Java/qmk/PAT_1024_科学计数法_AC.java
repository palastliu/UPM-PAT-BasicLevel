import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class PAT_1024_科学计数法_AC {
    public static void main(String[] args) throws IOException {  //哈哈哈 直接BigDecimal
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        BigDecimal n = new BigDecimal(x);
        System.out.println(n.toPlainString());
    }
}
