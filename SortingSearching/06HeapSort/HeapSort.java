class HeapSort {

  public void sort(int[] arr) {

  }

  public void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {12, 11, 13, 5, 6, 7};
    HeapSort sort = new HeapSort();
    sort.printArray(arr);
  }
}
