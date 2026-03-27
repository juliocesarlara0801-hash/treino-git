package treino;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Abertura de Conta ===");
        System.out.println("Digite o nome do titular: ");
        String titular = sc.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        ContaBancaria c = new ContaBancaria(titular, numeroConta);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Conta: " + c.getNumeroConta());
        System.out.println("Saldo: R$" + c.getSaldo());


        while (true) {
            System.out.println("\n=== Operações ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            int escolha = sc.nextInt();
            System.out.println("\nEscolha: " + escolha);

            double valor;

            switch (escolha) {
                case 1:
                    System.out.println("\nDigite o valor do deposito: ");
                    valor = sc.nextDouble();
                    c.depositar(valor);
                    break;

                case 2:
                    System.out.println("\nDigite o valor do saque: ");
                    valor = sc.nextDouble();
                    c.sacar(valor);
                    break;

                case 3:
                    System.out.println("\nSaldo atual: " + c.getSaldo());
                    break;

                case 4:
                    System.out.println("\nEncerrando...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Numero invalido");
                    break;

            }

        }


    }
}
