import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		long q = tc.nextLong();
		long fib[] = new long[61];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= 60; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int h = 0; h < q; h++) {
			int n = tc.nextInt();
			System.out.println("Fib(" + n + ") = " + fib[n]);
		}
	}
}
