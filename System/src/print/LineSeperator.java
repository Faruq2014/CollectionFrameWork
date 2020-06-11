package print;

public class LineSeperator {
	/*
	 * It returns "\n" on UNIX System. It returns "\r\n" on Windows System.
	 */

	public static void main(String[] args) {
		String a = "Faruq" + System.lineSeparator() + "Molla";
		System.out.println(a);
	}

}
