public class funcs {

public static int fib(int n) {
 int m;
 if (n < 2) {
    return 1;
    }
	 m = fib(n-1);
	 m = m + fib(n-2);
	 return m;
}

public static void main() {
  int i;
   i = 5;
   i = fib(i);
}

}
