class BubbleSort {

  void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if(arr[j] > arr[j+1]) {
          int temp = arr[j];
          swapped = true;
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      if(!swapped) return;
    }
  }

  void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }


  public static void main(String[] args) {
    BubbleSort bSort = new BubbleSort();
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    bSort.bubbleSort(arr);
    bSort.printArray(arr);
  }
}
