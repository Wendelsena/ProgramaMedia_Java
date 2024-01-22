import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<>();

        String name = null;
        char save;

        do {
            System.out.printf("O aluno já foi registrado? (s/n): ");
            save = sc.next().charAt(0);

            if (save == 'n') {
                System.out.print("\nPor favor, nos informe o nome completo do(a) aluno(a): ");
                sc.nextLine(); // Consumir a quebra de linha pendente
                name = sc.nextLine();

                System.out.print("Qual o ID do(a) aluno(a): ");
                String id = sc.nextLine();

                alunos.put(id, name);

                System.out.println("Aluno Registrado!\n");
            }
        } while (save == 'n');

        // Mostrar os alunos registrados
        System.out.println("\nAlunos Registrados:");
        for (Map.Entry<String, String> entry : alunos.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " --- Nome: " + entry.getValue());
        }

        // Procurar aluno por ID
        System.out.print("\nDigite o ID para buscar um aluno: ");
        String searchId = sc.next();
        if (alunos.containsKey(searchId)) {
            System.out.println("\nAluno encontrado: " + alunos.get(searchId));
        } else {
            System.out.println("\nAluno não encontrado.");
        }

        System.out.printf("\nDeseja calcular a média deste aluno? (s/n): ");
        save = sc.next().charAt(0);

        while (save == 's') {
            String[] vect = name.split(" ");
            System.out.printf("\nQual foi a nota da P1 do(a) aluno(a) " + vect[0] + "?: ");
            double P1 = sc.nextDouble();

            System.out.printf("Qual foi a nota da P2 do aluno " + vect[0] + "?: ");
            double P2 = sc.nextDouble();

            mediaProva(P1, P2);

            System.out.printf("\nDeseja Calcular Novamente? (s/n): ");
            save = sc.next().charAt(0);
        }

        System.out.printf("\nOk! Obrigado pelo uso. :D");

        sc.close();
    }

    public static void mediaProva(double a, double b) {
        double resultado = (a + b) / 2;
        System.out.printf("A média foi: %.1f%n", resultado);
    }
}
