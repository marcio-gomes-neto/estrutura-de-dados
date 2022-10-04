package Questão03;

import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<Integer>();
		Scanner rd = new Scanner(System.in);
		int menu = 1;
		
		while (menu != 0) {
			System.out.println("0 - Sair do programa");
		    System.out.println("1 - Inserir itens.");
		    System.out.println("2 - Remover itens.");
		    System.out.println("3 - Imprimir tamanho.");
		    System.out.println("4 - Imprimir item topo.");
		    System.out.println("5 - Substituir topo por base");
		    
		    System.out.printf("Insira a opção desejada: ");
		    menu = rd.nextInt();
			  
		    switch(menu) {
		    	case 0:
					System.out.println("Bye bye.");
					break;
		  		case 1:
			  		System.out.printf("Insira um valor:  ");
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
					System.out.println(pilha.size());						
					break;
				
				case 4:
					if(pilha.empty()) {
						System.out.println("Lista está vazia");
					} else {
						System.out.println(pilha.peek());
					}
					
					break;
					
				case 5:
					int lastElement = pilha.pop();
					pilha.add(pilha.elementAt(0));
					pilha.set(0, lastElement);
					break;
					
				default:
					System.out.println("Opção inváida.");
					break;
  			}
		}
	}
}
