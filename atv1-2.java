import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = entrada.nextInt();
		
		if(n1 != n2) {
			System.out.print("Os números digitados são diferentes, ");
			
			if(n1 > n2) {
				System.out.println("sendo o primeiro número o maior.");
			}
			else {
				System.out.println("sendo o segundo número o maior.");
			}
		}
		else {
			System.out.println("Os números digitados são iguais.");
		}
		
		entrada.close();
	}

}
