package Questão03;

import java.util.Scanner;
import java.util.Stack;

public class ParImpar {

	public static void main(String[] args) {
		Stack<Integer> pilha1 = new Stack<Integer>();
		Stack<Integer> pilha2 = new Stack<Integer>();
		Scanner rd = new Scanner(System.in);
		int menu = 1;
		
		while (menu != 0) {
			System.out.println("0 - Sair do programa");
		    System.out.println("1 - Inserir itens.");
		    
		    System.out.printf("Insira a opção desejada: ");
		    menu = rd.nextInt();
			  
		    switch(menu) {
		    	case 0:
					System.out.println("Bye bye.");
					break;
					
		  		case 1:
			  		System.out.printf("Insira um valor:  ");
			  		int value = rd.nextInt();
			  		
			  		if(value%2 == 0) {
			  			System.out.printf("Adicionado na pilha1 de pares\n\n");
			  			pilha1.add(value);
			  		} else {
			  			System.out.printf("Adicionado na pilha2 de impares\n\n");
			  			pilha2.add(value);
			  		}
			  		break;
				default:
					System.out.println("Opção inváida.");
					break;
  			}
		}

	}

}
