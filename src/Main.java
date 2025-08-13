import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Bruce Wayne";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.println("***************************************");

        String menuOpcoes = """
                \n** Escolha uma operação: **
                
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menuOpcoes);
            int opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.printf("O saldo disponível é de: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.println("Quanto você gostaria de receber?");
                    double valorRecebido = leitura.nextDouble();
                    if (valorRecebido >= 1) {
                        saldo += valorRecebido;
                        System.out.printf("Feito! Agora seu saldo é de: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido! Tente novamente.");
                    }
                    break;

                case 3:
                    System.out.println("Quanto você gostaria de transferir?");
                    double valorTransferido = leitura.nextDouble();

                    if (valorTransferido <= saldo && valorTransferido > 0) {
                        saldo -= valorTransferido;
                        System.out.printf("Transferência realizada com sucesso! \nAgora seu saldo é de R$ %.2f%n", saldo);
                    } else if (valorTransferido <= 0) {
                        System.out.println("Valor inválido! Tente novamente.");
                    } else {
                        System.out.println("Ops! Este valor ultrapassa seu saldo. Tente novamente.");
                    }
                    break;

                case 4:
                    opcao = 4;
                    System.out.println("Menu encerrado. Até a próxima!");
                    break;

                default:
                    System.out.println("Valor inválido! Tente novamente.");
                    break;

            }
        }
    }
}
