/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 120114567
 */
public class ContaBancaria {
    
    public int Numero;
    public String Nome;
    public String Agencia;
    public String Cpf;
    public Double Saldo;

    public void setNumero(int Numero) 
    { this.Numero = Numero; }
    public int getNumero() 
    { return Numero; }
    
    public void setNome(String Nome) 
    { this.Nome = Nome; }
    public String getNome() 
    { return Nome; }
    
    public void setAgencia(String Agencia) 
    { this.Agencia = Agencia; }
    public String getAgencia() 
    { return Agencia; }
    
    public void setCpf(String Cpf) 
    { this.Cpf = Cpf; }
    public String getCpf() 
    { return Cpf; }
    
    public void setSaldo(Double Saldo) 
    { this.Saldo = Saldo; }
    public Double getSaldo() 
    { return Saldo; }
    
     public ContaBancaria(int numero, String nome, String cpf){
         this.Numero = numero;
         this.Cpf = cpf;
         this.Nome = nome;
         this.Agencia = "0030";
         this.Saldo = 0.00;         
    }
     
    public void Depositar(double valor){
        this.Saldo += valor;
    }
    
    public void Retirar(double valor){
        this.Saldo -= valor;
    }
    
    public Double ExibirSaldo(){
        return this.Saldo;
    }
        
}
