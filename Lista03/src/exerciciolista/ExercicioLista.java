/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolista;

import java.util.Arrays;
import java.util.Random;

public class ExercicioLista {
   
    public static void main(String[] args) {
        Random rand = new Random(); 
        Cart cart = new Cart();
        
        cart.List(10);


            
        for (int x = 0; x < 10; x++) {
            
           Product product = new Product();
            
           product.id = x;
           product.name = "Produto " + x;
           product.desc = "Descricao do Produto " + x;
           product.quantity = rand.nextInt(10);
           product.value = rand.nextDouble();

           cart.Insert(product);  
          
            
           System.out.println(cart.Cart[x]);
        }
        
        
        
    }

}

