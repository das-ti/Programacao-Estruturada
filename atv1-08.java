import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um inteiro: ");
		n = entrada.nextInt();
		
		if (n < 0) {
			System.out.println("O número não pode ser negativo.");
		} 
		else {

			int soma = 0;
			int impar = 1;
			for (int count = 0; count < n; count++) {
				soma += impar;
				impar += 2;
			}
			System.out.println("A soma dos primeiros " + n + " números ímpares é: " + soma);

			entrada.close();
		}
	}
}
