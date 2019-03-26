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
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(154875,1000);
        cliente1.setNome("Danilo");
        
        cliente1.operar(4, 0);
        cliente1.operar(1, 1000);
        cliente1.operar(4, 0);
        
        Cliente cliente2 = new Cliente(154875,30);
        cliente2.setNome("Ebner");
        
        cliente2.operar(4, 0);
        cliente2.operar(1, 15);
        cliente2.operar(4, 0);
        
        Cliente cliente3 = new Cliente(154875,100000);
        cliente3.setNome("Emerson");
        
        cliente3.operar(4, 0);
        cliente3.operar(1, 500);
        cliente3.operar(4, 0);

        
        
    }
    
}
