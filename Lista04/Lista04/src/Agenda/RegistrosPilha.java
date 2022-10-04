package Agenda;
import java.util.Stack;
import java.util.Scanner;

public class RegistrosPilha {

	public static void main(String[] args) {
		 Stack<Agenda> noteStack = new Stack<Agenda>();
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
	    	  		System.out.println("Insira um nome.");
	    	  		String nome = rd.next();
	    	  		
	    	  		System.out.println("Insira um telefone.");
	    	  		long tel = rd.nextLong();
	    	  		
	    	  		Agenda note = new Agenda(nome, tel);
	    	  		noteStack.add(note);
	    	  		break;
	    	  		
	    	  	case 2:
	    	  		if(noteStack.empty()) {
	    	  			System.out.println("Lista já esta vazia");
	    	  		} else {
	    	  			System.out.println("Item Removido: " + noteStack.pop());
	    	  		}
	    	  		break;
	    	  		
	    	  	case 3:
	    	  		if(noteStack.empty()) {
	    	  			System.out.println("Lista já esta vazia");
	    	  		} else {
	    	  			for(int i = 0; i < noteStack.size(); i++) {
	    	  				Agenda element = noteStack.elementAt(i);
	    	  				System.out.printf("\n%s - %d", element.name, element.tel);
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
