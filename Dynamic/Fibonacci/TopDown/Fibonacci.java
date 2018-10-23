class Fibonacci {
  final int MAX = 100;
  final int NIL = -1;
  int[] lookUp = new int[MAX];

  public void initialize() {
    for (int i = 0; i < MAX; i++) {
      lookUp[i] = NIL;
    }
  }

  int fib(int n) {
    if (lookUp[n] == NIL) {
      if (n <= 1)
        lookUp[n] = n;
      else
        lookUp[n] = fib(n - 1) + fib(n - 2);
    }
    return lookUp[n];
  }

  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();
    fib.initialize();
    System.out.println("Fibonacci is: " + fib.fib(9));
  }
}
