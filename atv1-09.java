import java.util.Scanner;

public class VerificaNomeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes (um por linha):");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine().trim();
        }
      
        System.out.print("Digite o 6º nome (para verificar se está entre os primeiros 5): ");
        String sextoNome = sc.nextLine().trim();

        // Verificar com laço for
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(sextoNome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O 6º nome \"" + sextoNome + "\" está presente entre os 5 nomes informados.");
        } else {
            System.out.println("O 6º nome \"" + sextoNome + "\" não está entre os 5 nomes informados.");
        }

        sc.close();
    }
}
