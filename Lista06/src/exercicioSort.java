
public class exercicioSort {

	public static void main(String[] args) {
	    int[] arr = new int[500];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = (int) (Math.random() * (10000 - 1)) + 1;
	    }

	    int elementForSearch = arr[(int) (Math.random() * (500 - 1)) + 1];
	    
	    insertionSort(arr);
	    
	    long start = System.nanoTime();
	    int elementNewPos = binarySearch(elementForSearch, arr);
	    long end = System.nanoTime();
	    
	    System.out.println("O elemento " + elementForSearch + " foi encontrado na posição " + elementNewPos + " depois de " + (end - start) + " nanosegundos");
	
	    start = System.nanoTime();
	    int numberOfOccurrences = sequencialSearch(arr, elementForSearch);
	    end = System.nanoTime();
	    
	    System.out.println("O elemento " + elementForSearch + " se repetiu: " + numberOfOccurrences + ". Duração da busca: " + (end - start) + " nanosegundos");
	}
	
	  public static void insertionSort(int[] arr) {
	    int i;
	    for (int j = 1; j < arr.length; j++) {
	      int key = arr[j];
	      for (i = j - 1; (i >= 0) && (arr[i] > key); i--) {
	        arr[i + 1] = arr[i];
	      }
	      arr[i + 1] = key;
	    }
	  }
	  
	  public static int binarySearch(int x, int[] arr) {
		int start = 0, mid = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			mid = (end + start) / 2;
		
		  if(arr[mid] == x) {
		    return mid;
		  }
		  
		  if(arr[mid] < x) {
			  start = mid + 1;
		  } else {
			  end = mid - 1;
		  }
		}
		
		return -1;
	  }
	  
	  public static int sequencialSearch(int vet[], int valor){
		  int i=0, occurrences = 0;
		  
		  while ((i<vet.length)){
			  if(vet[i] == valor) {
				  occurrences++;
			  }
			  i++;
		  }

		  return occurrences;
	  }

}
