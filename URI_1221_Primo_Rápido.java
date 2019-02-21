import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int q = tc.nextInt();
		for (int i = 0; i < q; i++) {
			int n = tc.nextInt();
			int c = 1;
			for (int w = 2; w <= Math.sqrt(n); w++) {
				if (n % w == 0) {
					c = 0;
					break;
				}
			}
			if (c == 1) {
				System.out.println("Prime");
			} else if (c == 0) {
				System.out.println("Not Prime");
			}
		}
	}
}
