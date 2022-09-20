/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolista;
import java.util.Random;
/**
 *
 * @author 120114567
 */
public class Cart {
    
    int first = 0 ;
    int last = 0 ;
    int id ;
    int max ;
    Product [ ] Cart;
    
 public void List ( int max ) {
    this.max = max ;
    this.Cart = new Product[ max ];
    
 }
  // ******* Método para testar se a lista está vazia
 public boolean empty ( ) {
    return ( this.first == this.last ) ;
 }
  // ********* Método para adicionar um aluno na lista *
  public void Insert ( Product prod ) { 
      
    if ( prod.id >= max) {
      System.out.println ( " Lista Cheia .... Nao e permitido adicionar outro aluno " ) ;
    } 
    else if(first == 0){
      this.Cart[0] = prod;
      this.last = this.last + 1 ;
      first++;
    }
    else {
      this.Cart [ this.last ] = prod;
      this.last = this.last + 1 ;
      System.out.println ( " Aluno inserido com sucesso " );
    }                                                     
  }
  
    public void Deletar ( int id ) { 
                                  
    	Product[] newArr = this.Cart; 
        for(int i=0, k=0;i<this.Cart.length;i++){
            if(i!=id){
            	newArr[k]=this.Cart[i];
                k++;
            }
        }
        
        this.Cart = newArr;
  }
}
