package caixaeletronico;

/**
 *
 * @author ebner.m
 */

public class ContaCorrente {
    private int numero;
    private double saldo;
    private Cliente cliente;
    
    public ContaCorrente (Cliente clienteParam, int numeroParam, double saldoParam) {
        numero = numeroParam;
        saldo = saldoParam;
        cliente = clienteParam;
    }
    
    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depositou: "+ String.valueOf(valor));
    }
    
    public float retirar(float valor) {
        assert(saldo -valor >= 0);
        saldo = saldo - valor;
        System.out.println("Retirou");
        return valor;
    }
    
    public void verificarSaldo() {
        System.out.println("Saldo na conta: " + saldo);
    }
    
    public void impimir() {
        System.out.println("Cliente:  "+ cliente.getNome() +" - Conta: "+ numero+ " - Saldo: "+ saldo);
    }
}
