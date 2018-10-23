class SortedAndRotatedSearch {

  int findPivot(int[] arr, int low, int high) {
    if (high < low) return -1;
    if (high == low) return low;

    int mid = (low + high)/2;
    if (mid < high && arr[mid] > arr[mid + 1]) {
      return mid;
    }
    if (mid > low && arr[mid] < arr[mid - 1]) {
      return (mid -1);
    }
    if (arr[low] >= arr[mid]) {
      return findPivot(arr, low, mid - 1);
    }
    return findPivot(arr, mid + 1, high);
  }

  int binarySearch(int arr[], int l, int r, int x) {
    System.out.println("l: " + l + ", r: " + r);
    if (r >= l) {
      int mid = (r + l) / 2;

      if (arr[mid] == x) return mid;

      if(arr[mid] > x) {
        return binarySearch(arr, l, mid - 1, x);
      }
      return binarySearch(arr, mid + 1, r, x);
    }
    return -1;
  }

  int pivotedBinarySearch(int[] arr, int n, int x) {
    int pivot = findPivot(arr, 0, n - 1);
    System.out.println("pivot: " + pivot);
    if (pivot == -1) return binarySearch(arr, 0, n - 1, x);

    if (arr[pivot] == x) return x;
    if (arr[0] <= x)
      return binarySearch(arr, 0, pivot - 1, x);
    return binarySearch(arr, pivot + 1, n - 1, x);
  }


  public static void main(String[] args) {
    SortedAndRotatedSearch srs = new SortedAndRotatedSearch();
    int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    // int pivot = srs.findPivot(arr, 0, arr.length -1);
    int index = srs.pivotedBinarySearch(arr, arr.length, 3);
    System.out.println("index: " + index);
    // srs.sort(arr, );
  }
}
