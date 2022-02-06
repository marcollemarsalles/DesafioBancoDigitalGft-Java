package Banco_Digital_GFT_JAVA;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
        System.out.println("=== VOLTE SEMPRE ! ===");
        System.out.println(" ");
    }
    
}
