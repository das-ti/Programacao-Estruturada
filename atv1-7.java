import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int idade;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();

		if (idade >= 0 && idade < 18) {
			System.out.print("Menor de idade.");
		} 
		else if (idade >= 18 && idade < 60) {
			System.out.print("Adulto(a)");
		} 
		else if (idade >= 60) {
			System.out.print("Idoso(a)");
		} 
		else {
			System.out.println("A idade deve ser maior que zero: ");
		}
		entrada.close();
	}
}
