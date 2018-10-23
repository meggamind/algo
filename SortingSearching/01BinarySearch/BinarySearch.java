class BinarySearch {
  int binarySearch(int[] arr, int l, int r, int x) {
    if (r >= l) {

      int n = arr.length;
      int m = (r + l)/2;

      if(x == arr[m]) return m;

      if(x > arr[m]) {
        return binarySearch(arr, m + 1, r, x);
      }
      return binarySearch(arr, l, m - 1, x);
    }
    return -1;
  }


  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
    int arr[] = {2, 3, 4, 10, 40};
    int n = arr.length;
    int x = 10;
    System.out.println(x + " found at index: " + bs.binarySearch(arr, 0, n-1, x));
  }
}
