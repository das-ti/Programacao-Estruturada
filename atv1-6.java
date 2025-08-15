import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numero;
		long resultado = 1;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial");
		numero = entrada.nextInt();

		if (numero < 0) {
			System.out.print("Para calcular o fatorial o número não pode ser negativo.");
		} else {
			for (int i = 2; i <= numero; i++) {
				resultado *= i;
			}
			System.out.println("O fatorial de " + numero + "! é = " + resultado);
		}

		entrada.close();
	}
}
