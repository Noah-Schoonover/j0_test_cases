public class typeck_struct {
  public double dd;

public static typeck_struct mkFoo() {
  typeck_struct s;
  s = new typeck_struct();
  s.dd = 5.5;
  return s;
}

public static double fib(typeck_struct f, int i) {
   double x;
   x = f.dd * 2.0;
   return x;
}

public static void main(String [] argv) {
   typeck_struct f;
   double i;
   int j;
   i = 0.0 + fib(null, 3);
   i = 5.0;
   i = fib(null, 2 /* "hello" */);
   j = 5;
   System.out.println(j + "\n");
}
}
