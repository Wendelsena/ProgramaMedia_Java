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
            System.out.print("O aluno já foi registrado? (s/n): ");
            save = sc.next().charAt(0);

            if (save == 'n') {
                System.out.print("Por favor, nos informe o nome completo do(a) aluno(a): ");
                sc.nextLine(); // Consumir a quebra de linha pendente
                name = sc.nextLine();

                System.out.print("Qual o ID do(a) aluno(a): ");
                String id = sc.nextLine();

                alunos.put(id, name);

                System.out.println("Aluno Registrado!");
            }
        } while (save == 'n');

        // Mostrar os alunos registrados
        System.out.println("Alunos Registrados:");
        for (Map.Entry<String, String> entry : alunos.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nome: " + entry.getValue());
        }

        // Procurar aluno por ID
        System.out.print("Digite o ID para buscar um aluno: ");
        String searchId = sc.next();
        if (alunos.containsKey(searchId)) {
            System.out.println("Aluno encontrado: " + alunos.get(searchId));
        } else {
            System.out.println("Aluno não encontrado.");
        }
        
        System.out.println("Deseja calcular a média deste aluno? (s/n): ");
        save = sc.next().charAt(0);
       
		String[] vect = name.split(" ");
        if (save == 's') {
        	
        	System.out.println("Qual foi a nota da P1 do aluno: " + vect[0]);
        	double P1 = sc.nextDouble();
        	
        	System.out.println("Qual foi a nota da P2 do aluno: " + vect[0]);
        	double P2 = sc.nextDouble();
        	
        	double Media = (P1 + P2) / 2;
        	
        	System.out.printf("A média foi: %.2f%n", Media);
        }
        else {
        	System.out.println("Muito obrigado!!! :D");
        	
        }

        sc.close();
    }
}
