package Banco_Digital_GFT_JAVA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            Cliente MarcolleMarsalles = new Cliente();
            MarcolleMarsalles.setNome("Marcolle Marsalles");

            Conta cc = new ContaCorrente(MarcolleMarsalles);
            Conta poupanca = new ContaPoupança(MarcolleMarsalles);
            int entradaUsuario;
            int valorTransferencia;

            cc.depositar(100);
            poupanca.depositar(200);

            System.out.print("Seja bem vindo ao seu banco digital GFT-DIO \n\n");

            System.out.println("- Opção 1: Saldo - Conta Corrente");
            System.out.println("- Opção 2: Saldo -  Conta Poupança");
            System.out.println("- Opção 3: Transferir para Conta Poupança");
            System.out.println("- Opção 4: Transferir para Conta Corrente \n\n");

            System.out.print("Digite uma das opções acima para continuar seu atendimento: \n");
            entradaUsuario = scan.nextInt();

            switch (entradaUsuario) {
                case 1:
                    cc.imprimirExtrato();
                    break;
                case 2:
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.print("Digite o valor que será transferido \n");
                    valorTransferencia = scan.nextInt();
                    cc.transferir(valorTransferencia, poupanca);
                    System.out.print("\n\nTransferência realizada com sucesso Seu saldo atual é de: \n\n");
                    cc.imprimirExtrato();
                    break;
                case 4:
                    System.out.print("Digite o valor que será transferido \n");
                    valorTransferencia = scan.nextInt();
                    poupanca.transferir(valorTransferencia, cc);
                    System.out.print("\n\nTransferência realizada com sucesso Seu saldo atual é de: \n\n");
                    poupanca.imprimirExtrato();
                    break;
            }

        }

    }

}
