public class whiletst {
// A test of while loop syntax
public static int d20;
public static int random() {
	return d20 != 20;
}

public static int main() {
	int test1;
	int test2;
        // infinite loop
	while (1) {
		test1 = test1 + 1;

	}
	// While loop with incrementing variable
	test1 = 0;
	while (test1 < 10) {
		test1 = test1 + 1;
	}

	// While loop with different expression
	test2 = 0;
	while (test2 != 1) {
		test2 = 1;
	}

	// While loop with function call (and empty body)
	while (random()) {

	}

	for(test1=0; test1<20; test1++) {
	   test1 = test1 + 1;
	   }

}
}
// whiletst.java output [expect a syntax tree]
