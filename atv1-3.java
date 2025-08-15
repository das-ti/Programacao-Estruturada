import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char menu = 's';
		int opcao;
		double area;

		while (menu == 's') {

			System.out.println("[1] - Calcular Área do Quadrado.");
			System.out.println("[2] - Calcular Área do Círculo.");
			System.out.print("Digite uma opção: ");

			opcao = entrada.nextInt();
			entrada.nextLine();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o valor do lado medido: ");
				double l = entrada.nextDouble();

				area = Math.pow(l, 2);

				System.out.printf("A área do quadrado é: %.2f m²%n", area);
				break;
			}
			case 2: {
				System.out.print("Digite o valor do raio medido: ");
				double r = entrada.nextDouble();

				area = Math.PI * Math.pow(r, 2);

				System.out.printf("A área do círculo é: %.2f m²%n", area);
				break;
			}
			default:
				System.out.println("Digite a opção correta: 1 ou 2.");

				break;
			}

			System.out.print("Pressione [s] para voltar ao menu ou outra tecla para sair:  ");
			menu = entrada.next().toLowerCase().charAt(0);	
		}

		entrada.close();

		System.out.println("Programa finalizado.");
	}
}
