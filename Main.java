import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Ligar lâmpada");
            System.out.println("2 - Desligar lâmpada");
            System.out.println("3 - Mostrar estado");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lampada.ligar();
                    break;
                case 2:
                    lampada.desligar();
                    break;
                case 3:
                    lampada.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
