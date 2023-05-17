import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nome = "Lorem Ipsum";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("""
                ***********************
                Dados iniciais do Cliente:
                
                Nome: Lorem Ipsum
                Tipo de conta: Corrente
                Saldo: %.2f
                
                ***********************
                """.formatted(saldo));

            System.out.print("""         
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """);

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$ " + saldo);

            } else if (opcao == 2) {
                System.out.print("Informe o valor a receber: ");
                saldo += scanner.nextDouble();

            } else if (opcao == 3) {
                System.out.println("Informe o valor a transferir: ");
                double transferencia = scanner.nextDouble();

                if (saldo >= transferencia) {
                    saldo = saldo - transferencia;
                    System.out.println("Valor transferido com sucesso.");

                } else {
                    System.out.println("Saldo insuficiente para transferência.");
                }

            } else {
                break;
            }
        }
    }

}
