/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author ebner.m
 */
public class Cliente {
    private String nome;
    private ContaCorrente conta_corrente;
    
    public Cliente (int numeroParam, double saldoParam) {
        conta_corrente = new ContaCorrente(this, numeroParam, saldoParam);
    }
    
    public void operar(int param, float valor) {
        if(param == 1 || param == 2) {
            if (valor <= 0) {
                System.out.println("Necessário informar um valor ANIMAL!");
                return;
            }
        }
        
        switch (param) {
            case 1:
                conta_corrente.depositar(valor);
                break;
            case 2:
                conta_corrente.retirar(valor);
                break;
            case 3:
                conta_corrente.verificarSaldo();
                break;
            case 4:
                conta_corrente.impimir();
                break;
            default:
                break;
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
