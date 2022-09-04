import java.util.Scanner;

public class Questão05 {
	public static void main(String[] args) {
		int matriz[] = new int[10];
		Boolean modificado[] = new Boolean[10];
		Scanner in = new Scanner(System.in);
		int posSelecionada, valorNovo;
		String saida = "a";
		
        for (int i = 0; i < 10; i++) {
        	modificado[i] = false;
        	matriz[i] = (int) (Math.random()*(100-1+1)+1);
        }
        
        while(true){
        	saida = "a";
            for (int i = 0; i < 10; i++) {
            	System.out.printf("Posição: %d - Modificado: %b - Valor: %d \n", i, modificado[i], matriz[i]);
            }
            while(!saida.equals("s") && !saida.equals("S") && !saida.equals("n") && !saida.equals("N")){
            	System.out.printf("Deseja sair? S/N\n");
            	saida = in.next();
            	if(saida.equals("S") || saida.equals("s")) {
            		System.out.println(saida);
            		System.exit(0);
            	}
            } 
            
            
            System.out.printf("Selecione a posição nova: ");
            posSelecionada = in.nextInt();
            
            while(modificado[posSelecionada]) {
                System.out.printf("Posição já alterada, selecione outra: ");
                posSelecionada = in.nextInt();
            }
            
            System.out.printf("Selecione a valor novo: ");
            valorNovo = in.nextInt();
            matriz[posSelecionada] = valorNovo;
            modificado[posSelecionada] = true;
            
            limparTela();
        }
	}
	
	static void limparTela() {
		System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
