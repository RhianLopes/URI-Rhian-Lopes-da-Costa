import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float v1 = teclado.nextFloat();

		float r1 = v1 / 100;
		float w1 = v1 % 100;
		float r2 = w1 / 50;
		float w2 = w1 % 50;
		float r3 = w2 / 20;
		float w3 = w2 % 20;
		float r4 = w3 / 10;
		float w4 = w3 % 10;
		float r5 = w4 / 5;
		float w5 = w4 % 5;
		float r6 = w5 / 2;
		float w6 = w5 % 2;
		float r7 = w6 / 1;
		float w7 = w6 % 1;
		double r8 = w7 / 0.5;
		double w8 = w7 % 0.5;
		double r9 = w8 / 0.25;
		double w9 = w8 % 0.25;
		double r10 = w9 / 0.10;
		double w10 = w9 % 0.10;
		double r11 = w10 / 0.05;
		double w11 = w10 % 0.05;
		double r12 = w11 / 0.01;

		System.out.print("NOTAS:\n");
		System.out.print((int) r1 + " nota(s) de R$ 100.00\n");
		System.out.print((int) r2 + " nota(s) de R$ 50.00\n");
		System.out.print((int) r3 + " nota(s) de R$ 20.00\n");
		System.out.print((int) r4 + " nota(s) de R$ 10.00\n");
		System.out.print((int) r5 + " nota(s) de R$ 5.00\n");
		System.out.print((int) r6 + " nota(s) de R$ 2.00\n");
		System.out.print("MOEDAS:\n");
		System.out.print((int) r7 + " moeda(s) de R$ 1.00\n");
		System.out.print((int) r8 + " moeda(s) de R$ 0.50\n");
		System.out.print((int) r9 + " moeda(s) de R$ 0.25\n");
		System.out.print((int) r10 + " moeda(s) de R$ 0.10\n");
		System.out.print((int) r11 + " moeda(s) de R$ 0.05\n");
		System.out.printf("%.0f moeda(s) de R$ 0.01\n",r12);
	}

}
