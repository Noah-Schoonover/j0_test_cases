public class IfElseClass {
   public static void main(String argv[]) {
	   boolean b1 = true;
	   boolean b2 = false;
	  if (b1) { }

	  if (true) {

	  }

      if (b1 == true && b2 == false || 4 > 5) {
		  // do nothing
	  }

	  if (true) {
		  b1 = false;
	  } else {
		  b1 = b2;
	  }

	  int a = 4;
	  int b = 4;
	  int x =3;
	  int y=4;
	  if (b1) {
		  a = a + b;
	  } else if (x > y) {
		  a = a - b;
		  a++;
	  } else if (x < y) {
		  a = a * b;
	  } else {
		  a = b * b;
	  }
   }
}
