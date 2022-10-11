/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista05;

import java.lang.reflect.Array;

/**
 *
 * @author 120114567
 */
public class Row {
    
    int end;
    int maxSize;
    char[] itens; 

    public Row() {
        this.end = 0;
        this.maxSize = 0;
        this.itens = new char[0];
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        this.itens = new char[maxSize];
    }
   
    
    public void push(char n){       
        this.itens[this.end] = n;
        end++;
    }
    
    public char front(){       
      return this.itens[0];
    }
    
    public int end(){       
      return this.end;
    }
    
    public boolean empty(){       
      return (this.end == 0);
    }
    
    public boolean full(){       
      return (this.end == this.maxSize);
    }
    
    public void pop() {
     for (int i=0; i<(this.end); i++){
        this.itens[i] = this.itens[i+1];       
     }
     
     this.end--; 
        itens[end] = 0;
    }
    
}
