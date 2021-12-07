import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1001 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());

		// 统计计算了多少步
		int count = 0;
		while (n != 1) {
			// 如果是偶数，取一半
			if (n % 2 == 0) {
				n /= 2;
			} else {
				// 否则 取（3 * n + 1）的一半
				n = (3 * n + 1) / 2;
			}
			count++;
		}

		System.out.println(count);

	}

}
