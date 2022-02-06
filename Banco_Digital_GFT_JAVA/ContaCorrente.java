package Banco_Digital_GFT_JAVA;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
        System.out.println("=== VOLTE SEMPRE ! ===");
        System.out.println(" ");
    }
    
}
