import java.util.Scanner;

public class SenhaSecreta {
    public static void main(String[] args) {
        String senha = "java123"
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a senha: ");
            String senha = entrada.nextLine();

            if (entrada.equals(SENHA_SECRETA)) {
                System.out.println("Senha correta. Acesso autorizado!");
                break;
            } else {
                System.out.println("Senha inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}
