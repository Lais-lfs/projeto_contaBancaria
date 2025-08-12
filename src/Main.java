import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldoInicial = 2500.00;
        double saldo = 0;
        String dadosCliente = """
                ***************************************
                
                Dados iniciais do cliente:
                
                Nome: Laís Lara Ferreira
                Tipo de conta: Poupança
                Saldo inicial: R$ 2500,00
                
                ***************************************
                
                """;
        String menuOpcoes = """
                Operações:
                
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);
        String solicitarOperacao = "Digite a opção desejada:";

        System.out.println(dadosCliente + menuOpcoes + solicitarOperacao);

        int opcaoEscolhida = leitura.nextInt();

        switch (opcaoEscolhida) {
            case 1:
                System.out.println("O saldo disponível é de: " + (saldoInicial+saldo));
                break;
            case 2:
                System.out.println("Quanto você gostaria de receber?");
                double valorRecebido = leitura.nextDouble();
                System.out.println("Feito! Agora seu saldo é de R$ %.2f" + saldoInicial + valorRecebido);
                break;
            case 3:
                System.out.println("Quanto você gostaria de transferir?");
                // double valorTransferido = leitura.nextDouble();
                break;
            case 4:
                break;

        }
    }
}
