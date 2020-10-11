import java.math.*;

class MainClass {
  public static void main(String[] args) {
    System.out.println(recursionFactorialMethod(5));
  }

  //Big Integer method
  static BigInteger bigIntegerFactorialMethod(BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) == 0) {
			return BigInteger.ONE;
		} else {
			BigInteger result = BigInteger.ONE;

			for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
				result = result.multiply(i);
			}
			return result;
		}
	}

  //For loop method
  static long loopFactorialMethod(long n) {
		if (n == 0) {
			return 1;
		} else {
			long result = 1;

			for (long i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		}
	}

  //Recursion method
  static long recursionFactorialMethod(long n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * recursionFactorialMethod(n - 1));
		}
	}
}
