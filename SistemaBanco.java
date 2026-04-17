import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double saldo = 0;

        while (opcao != 4) {
            System.out.println("\n=== BANCO ===");
            System.out.println("1- Ver saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é: R$ " + saldo);
                break;

            case 2:
                System.out.print("Digite um valor para depositar: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado");
                break;

            case 3:
                System.out.print("Digite um valor para sacar: ");
                double saque = scanner.nextDouble();

                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;

            case 4:
                System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida");
        }
    }
        scanner.close();
    }
}