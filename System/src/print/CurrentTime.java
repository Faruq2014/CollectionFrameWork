package print;

public class CurrentTime {

	public static void main(String[] args) {
		System.out.println("Current time in millisecond");
		System.out.println(System.currentTimeMillis()); // method of calling current time in millisecond
		System.out.println("Current time in nanoseconds = " + System.nanoTime());
	}

}
