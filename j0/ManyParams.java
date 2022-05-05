public class hello {
	public static int f(int i, int j, int k, char c, String[] arr) {
	   int x;
	   x = i;
	   int y;
	   y = j;
	   int z;
	   z = k;
	   return 5;
	}

   public static void main(String argv[]) {
	   int a = 5;
	   char d = 'q';
	   int[] intArr = new int[5];
	   String[] strArr = new String[5];
	   // f(a, 3, 4, d, strArr);
	   int r;
	   r = f(a, 3+5, 4, d, strArr);

   }
}
