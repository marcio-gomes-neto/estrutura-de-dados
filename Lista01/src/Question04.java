import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int matriz[] = new int[10];
		int valorConfessado;
		int valorRoubado = 0;
		
        for (int i = 0; i < 10; i++) {
        	System.out.printf("Digite um valor: ");
        	matriz[i] = in.nextInt();
        }

        System.out.printf("\nDigite o valor confessado: ");
        valorConfessado = in.nextInt();
        System.out.printf("\n\n");
        for (int i = 0; i < 10; i++) {
        	if (matriz[i] >= valorConfessado && matriz[i]%10 == 0) {
        		valorRoubado += matriz[i];
        		System.out.printf("Bandido na posição: %d\n", i);
        	}
        	
        	
        }
        
        System.out.printf("O valor total roubado foi de: %d", valorRoubado);
	}
}
