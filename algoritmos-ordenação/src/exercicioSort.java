class exercicioSort {
  public static void main(String[] args) {

    int num = 20000;
    int[] arr = new int[num];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * num);
    }

    long tempoInicial = System.nanoTime();
    insertionSort(arr);
    long tempoFinal = System.nanoTime();

    System.out.println("Insert Sort " + num + " elementos foi executado em " + (tempoFinal - tempoInicial) + " nano segundos");

    tempoInicial = System.nanoTime();
    mergeSort(arr, arr.length);
    tempoFinal = System.nanoTime();

    System.out.println("Merge Sort de " + num + " elementos foi executado em " + (tempoFinal - tempoInicial) + " nano segundos\n");
    
    num = 200;
    
    tempoInicial = System.nanoTime();
    insertionSort(arr);
    tempoFinal = System.nanoTime();

    System.out.println("Insert Sort " + num + " elementos foi executado em " + (tempoFinal - tempoInicial) + " nano segundos");

    tempoInicial = System.nanoTime();
    mergeSort(arr, arr.length);
    tempoFinal = System.nanoTime();

    System.out.printf("Merge Sort de " + num + " elementos foi executado em " + (tempoFinal - tempoInicial) + " nano segundos");

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

  public static void mergeSort(int[] a, int n) {
    if (n < 2)  return;

    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }

    mergeSort(l, mid);
    mergeSort(r, n - mid);

    int i = 0, j = 0, k = 0;
    while (i < mid && j < n - mid) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      } else {
        a[k++] = r[j++];
      }
    }
    while (i < mid) {
      a[k++] = l[i++];
    }
    while (j < n - mid) {
      a[k++] = r[j++];
    }
  }
}