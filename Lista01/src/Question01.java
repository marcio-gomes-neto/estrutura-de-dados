
public class Question01 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
                matriz[i][j] = i + j + 2;
            }
        }
        
        System.out.printf("X__|_1__|_2__|_3__|_4__|_5__|_6__|_7__|_8__|_9__|_10_|\n");
        for (int i = 0; i < 10; i++) {
      	  if(i+1 >= 10 ) {    	
      		  System.out.printf("%d | ", i+1);
    	  } else {  
    		  System.out.printf("%d  | ", i+1);
    	  }
        	
          for (int j = 0; j < 10; j++) {
        	  if(matriz[i][j] >= 10 ) {
        		  System.out.printf("%d | ", matriz[i][j]);        		  
        	  } else {
        		  System.out.printf("%d  | ", matriz[i][j]);      
        	  }
            }
          System.out.printf("\n");
        }
        
        
    }
}