public class IfElseClass {
   public static void main(String argv[]) {
	   boolean t;
	   boolean f;
	  if (t) { }

	  if (true) {
		  doSomething(abc, def, ghi);
	  }

      if (t == true && f == false || 4 > 5) {
		  // do nothing
	  }

	  if (true) {
		  doSomething(true);
	  } else {
		  doSomethingElse("hello");
	  }

	  int x;
	  int y;
	  if (t) {
		  a = a + b;
	  } else if (x > y) {
		  a = a - b;
		  doSomething(55);
	  } else if (x < y) {
		  a = a * b;
	  } else {
		  a = b * b;
	  }
   }
}
