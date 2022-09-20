/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 120114567
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        int numero = 0;
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        
        Scanner scan = new Scanner(System.in);
       

        int menu = 0;
        
        while(menu < 1 || menu > 5){
            System.out.println("Banco UTC");
            System.out.println("1 - Iniciar nova conta");
            System.out.println("2 - Depositar na Conta");
            System.out.println("3 - Retirar Valor");
            System.out.println("4 - Exibir saldo");
            System.out.println("5 - Transferir Valores");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                   System.out.println("Insira seu Nome:");
                   String nome = scan.next();            
                   System.out.println("Insira seu Cpf:");
                   String cpf = scan.next();
                   
                   ContaBancaria novaConta = new ContaBancaria(numero, nome, cpf);                  
                   contas.add(novaConta);  
                   
                   numero ++;
                   menu = 0;
                   break;
                
                case 2:
                   System.out.println("Insira o numero da conta:");
                   int numeroContaDepositar = scan.nextInt();            
                   System.out.println("Insira o valor nesse padrão(0,00):");
                   Double valorDepositar = scan.nextDouble();
                                
                   contas.get(numeroContaDepositar).Depositar(valorDepositar);    
                   menu = 0;
                   break;
                   
                case 3:
                   System.out.println("Insira o numero da conta:");
                   int numeroContaRetirar = scan.nextInt();            
                   System.out.println("Insira o valor nesse padrão(0,00):");
                   Double valorRetirar = scan.nextDouble();
                                
                   contas.get(numeroContaRetirar).Retirar(valorRetirar);
                   menu = 0;
                break;
                case 4:
                   System.out.println("Insira o numero da conta:");
                   int numeroContaExibir = scan.nextInt();            
 
                                
                   double saldo = contas.get(numeroContaExibir).ExibirSaldo();
                   System.out.printf("O valor na sua conta é: %.2f \n", saldo);
                   menu = 0;
                break;
                case 5:
                   System.out.println("Insira o numero da conta de origem:");
                   int numeroContaOrigem = scan.nextInt();
                   System.out.println("Insira o valor nesse padrão(0,00):");
                   Double valorTranferencia = scan.nextDouble();
                   System.out.println("Insira o numero da conta de destino:");
                   int numeroContaDestino = scan.nextInt();
                   
                   contas.get(numeroContaOrigem).Retirar(valorTranferencia);
                   contas.get(numeroContaDestino).Depositar(valorTranferencia);
                   menu = 0;
                break;
                    
                    
                                


            }
        }
    }
        
        
}   

