public class IfElseClass {
	public static void main(String argv[]) {
		boolean b1 = true;
		boolean b2 = false;
		int i;

		if (b1 || b2 && b1) {
			System.out.println("hi");
			i = 0;

		} else {
			i = 1;
			b1 = false;
		}

	}
}
