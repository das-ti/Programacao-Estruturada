import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("Este número é par.");
		}
		else {
			System.out.print("Este número é ímpar.");
		}
		
		entrada.close();
	}
}
