// Create a Main class
public class Main {
	public static int x;  // Create a class attribute

	// Create a class constructor for the Main class
	Main(int x) {
		x = x;
		x = x + 1;
		int y = 999;
	}

	public static void main(String args[]) {
		// Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
		System.out.println(x); // Print the value of x
	}
}
