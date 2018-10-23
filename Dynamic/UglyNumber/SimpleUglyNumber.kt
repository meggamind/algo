fun maxDivide(a: Int, b: Int): Int {
  var a1 = a
  var b1 = b
  while (a1 % b1 == 0) {
    a1 = a1 / b1
  }
  return a1
}


fun isUgly(no: Int): Boolean {
  var no1 = no
  no1 = maxDivide(no1, 2);
  no1 = maxDivide(no1, 3);
  no1 = maxDivide(no1, 5);
  return no1 == 1
}

fun getUglyNumber(n: Int): Int {
  var i = 1
  var count = 1

  while (n > count) {
    i++
    if (isUgly(i)) count++
  }
  return i
}

fun main(args: Array<String>) {
  println("getUglyNumber: ${getUglyNumber(150)}")
}
