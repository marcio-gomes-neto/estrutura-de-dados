public class Question02 {
	public static void main(String[] args) {
		int matriz[] = new int[10];
		
        for (int i = 0; i < 10; i++) {
        	matriz[i] = (int) (Math.random()*(1000-1+1)+1);
        }
     
        for (int i = 0; i < 10; i++) {
        	boolean prime = isPrime(matriz[i]);
    		System.out.printf("POS: %d - VALUE: %d - PRIME: %b\n", i, matriz[i], prime);
        }
        
	}
	
    static boolean isPrime(int num){
	   if(num<=1){
	        return false;
	   }
	   
	   for(int i=2;i<=num/2;i++){
	       if((num%i)==0)
	           return  false;
	   }

	   return true;
    }
}
