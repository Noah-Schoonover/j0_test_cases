public class gotos {
public static String itoa(int i) {
   return "not\t i\n";
}
public static void main() {
  int i;
  int j;
  int k;
   i = 5;
   k = 0;
   while (!i) {
   i = i-1;
   }
   for (i=0; i<5; i = i+1) {
      for (j=0; j<5; j=j+1) {
        if (i<j) {
	k = k + 1;
	}
        if (i==j) {
	k = k + 2;
	} else {
	k = k - 1;
	}
      }
      }
   System.out.println("k "+ itoa(k));
}
}
