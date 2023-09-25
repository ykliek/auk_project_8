package part_3;

public class WorkWithStringsRecursively {
	public static void main(String[] args) {
		// 1. Print string
		printString("Hello World!");

		// 2. Print string backwards
		printReverseBackward("Hello World!");

		// 3. Reverse string
		String reversedString = reverseString("Hello World!");
		System.out.println(reversedString);
	}

	/**
	 * This recursive method takes a string as a parameter and displays the
	 * letters of the string, one on each line.
	 *
	 * @param s string to print
	 */
	public static void printString(String s) {
		if (s.length() == 0) {
			return;
		}
		System.out.println(s.charAt(0));
		printString(s.substring(1));
	}

	/**
	 * This recursive method takes a string as a parameter abd displays the
	 * letters of the string backwards, one on each line.
	 *
	 * @param s string to print
	 */
	public static void printReverseBackward(String s) {
		if (s.length() == 0) {
			return;
		}
		System.out.println(s.charAt(s.length() - 1));
		printReverseBackward(s.substring(0, s.length() - 1));
	}

	/**
	 * This recursive method takes a string as a parameter and returns new
	 * string as a return value. The new string contains the same letters as
	 * the parameter string, but in reverse order.
	 *
	 * @param s string to reverse
	 */
	public static String reverseString(String s) {
		if (s.length() == 0) {
			return "";
		}
		return s.charAt(s.length() - 1) + reverseString(
				s.substring(0, s.length() - 1));
	}
}
