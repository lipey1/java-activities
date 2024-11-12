import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("O que deseja fazer?\n1 - Criar tarefa\n2 - Remover tarefa\n3 - Listar tarefas\n4 - Sair");
            int choice = sc.nextInt();
            sc.nextLine();  // Limpa a nova linha pendente após nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Insira o nome da tarefa: ");
                    String nome = sc.nextLine();
                    manager.addTask(nome);
                    break;
                case 2:
                    System.out.println("Insira o nome da tarefa a remover: ");
                    nome = sc.nextLine();  // Reutilizando a variável "nome"
                    manager.removeTask(nome);
                    break;
                case 3:
                    manager.listTasks();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }
}
