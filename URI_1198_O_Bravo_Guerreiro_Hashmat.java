import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		while (tc.hasNext()) {
			long s1 = tc.nextLong();
			long s2 = tc.nextLong();
			long max = Math.max(s1, s2);
			long min = Math.min(s1, s2);
			long x = max - min;
			System.out.println(x);
		}
	}
}
