package print;

public class Exit {
	/*
	 * Status - exit(0) - indicates Successful termination Status - exit(-1) -
	 * indicates unsuccessful termination with Exception Status - exit(1) -
	 * indicates Unsuccessful termination
	 */

	public static void main(String[] args) {
		exit0();
		exit1();
	}

	public static void exit0() {

		int a[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 5) {
				System.out.println("array[" + i + "]=" + a[i]);
			} else {
				System.out.println("terminating jvm,exiting");
				System.exit(0);// Treminatejvm
			}
		}

	}

	public static void exit1() {
		System.out.println("program will terminate when i is 1");
		for (int i = 10; i > 0; i--) {
			System.out.println("your no is " + i);
			if (i == 1) {
				System.out.println("Value is 1 now terminating your program");
				System.exit(1); // exit program
			}
		}
	}
}
