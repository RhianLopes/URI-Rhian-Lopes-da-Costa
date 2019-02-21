import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		while (tc.hasNext()) {
			long n1 = tc.nextLong();
			long n2 = tc.nextLong();
			long mul1 = 1;
			long mul2 = 1;
			if (n1 != 0) {
				for (long x = 1; x <= n1; x++) {
					mul1 = mul1 * x;
				}
			}
			if (n2 != 0) {
				for (long y = 1; y <= n2; y++) {
					mul2 = mul2 * y;
				}
			}
			long mul = mul1 + mul2;
			System.out.println(mul);
		}
	}
}
