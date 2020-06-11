package print;

public class HashCode {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("identity hash code of object a = " + System.identityHashCode(a));
		int b = 10;
		System.out.println("identity hash code of object b = " + System.identityHashCode(b));
		String c = "faruq";
		System.out.println("identity hash code of object c = " + System.identityHashCode(c));
	}

}
