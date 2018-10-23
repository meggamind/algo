class InsertionSort {

  public void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      // for (int j = i; j < n; j++) {
      int key = arr[i];
      int j = i - 1;

      while(j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  public void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print( arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    InsertionSort sort = new InsertionSort();
    int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
    sort.insertionSort(arr);
    sort.printArray(arr);
  }
}
