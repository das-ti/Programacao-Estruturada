import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		n = entrada.nextInt();
		
		if(n > 0) {
			System.out.println("O número " + n + " é positivo.");
		}else {
			System.out.println("O número " + n + " é negativo.");
		}
		entrada.close();
	}

}
