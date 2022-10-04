package Questão02;

import java.util.Scanner;
import java.util.Stack;

public class InsercaoPilha {

	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<Integer>();
		Scanner rd = new Scanner(System.in);
		int menu = 0;
		
      while (menu != 4) {
    	  System.out.println("1 - Adicionar novo registro.");
    	  System.out.println("2 - Remover ultimo registro.");
    	  System.out.println("3 - Ver Registros.");
    	  System.out.println("4 - Sair do programa.");
    	  
    	  menu = rd.nextInt();
    	  
    	  switch(menu) {
    	  	case 1:
    	  		System.out.println("Insira um valor.");
    	  		int value = rd.nextInt();
    	  		
    	  		pilha.add(value);
    	  		break;
    	  		
    	  	case 2:
    	  		if(pilha.empty()) {
    	  			System.out.println("Lista já esta vazia");
    	  		} else {
    	  			System.out.println("Item Removido: " + pilha.pop());
    	  		}
    	  		break;
    	  		
    	  	case 3:
    	  		if(pilha.empty()) {
    	  			System.out.println("Lista já esta vazia");
    	  		} else {
    	  			for(int i = 0; i < pilha.size(); i++) {
    	  				int element = pilha.elementAt(i);
    	  				System.out.printf("\n%d", element);
    	  			}
    	  			System.out.printf("\n\n");
    	  		}
    	  		
    	  		break;
    	  	
    	  	case 4:
    	  		System.out.println("Bye bye.");
    	  		break;
    	  	
    	  	default:
    	  		System.out.println("Opção inváida.");
    	  		break;
    	  		
  			}
      }
	}
}
