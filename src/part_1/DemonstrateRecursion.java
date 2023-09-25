/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   DemonstrateRecursion.java                    :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/25 20:22:25 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/25 20:23:00 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

/**
 * This class demonstrates recursion.
 */
public class DemonstrateRecursion {
	/**
	 * This method is the entry point of the program.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// 1. Demonstrate recursion
		printNumberBackward(9);
		printNumber(9);

		// 2. Demonstrate StackOverflowError
		// Uncomment the following line to see the error:
		// printNumberWithoutBaseCase(9);
	}

	/**
	 * This method prints numbers from n to 1.
	 *
	 * @param n number to start from
	 */
	public static void printNumberBackward(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printNumberBackward(n - 1);
	}

	/**
	 * This method prints numbers from 1 to n.
	 *
	 * @param n number to start from
	 */
	public static void printNumber(int n) {
		if (n == 0) {
			return;
		}
		printNumber(n - 1);
		System.out.println(n);
	}

	/**
	 * This is recursive method without base case which demonstrates
	 * StackOverflowError.
	 *
	 * @param n number to start from
	 */
	public static void printNumberWithoutBaseCase(int n) {
		System.out.println(n);
		printNumberWithoutBaseCase(n - 1);
	}
}
