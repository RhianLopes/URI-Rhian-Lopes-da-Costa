import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		while (tc.hasNext()) {
			String x = tc.nextLine();
			int q = x.length();
			char vetor[] = x.toCharArray();
			int t = 0;
			String frase = "";

			for (int i = 0; i < q; i++) {
				if (vetor[i] != ' ') {
					if (t % 2 == 0) {
						vetor[i] = Character.toUpperCase(vetor[i]);
						t++;
					} else {
						vetor[i] = Character.toLowerCase(vetor[i]);
						t++;
					}
				}

				frase += vetor[i];

			}
			System.out.println(frase);
		}
	}
}
