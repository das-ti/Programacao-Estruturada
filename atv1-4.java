import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numero, resultado;

		Scanner entrada = new Scanner(System.in);
    
		System.out.println("Digite um número para gerar uma tabuada: ");
		numero = entrada.nextInt();

		for (int m = 0; m <= 10; m++) {
			resultado = numero * m;
			System.out.println(numero + " x " + m + " = " + resultado);
		}
		entrada.close();
	}
}
