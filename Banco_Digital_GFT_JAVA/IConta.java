package Banco_Digital_GFT_JAVA;



public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    
}
