/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   RecursionAndArrays.java                      :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/25 20:30:11 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/25 20:30:18 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_2;

public class RecursionAndArrays {
	public static void main(String[] args) {
		// 1. Print array elements
		int[] array = {1, 2, 3, 4, 5};
		printArray(array, 0);

		// 2. Calculate sum of array elements
		int sum = arraySum(array, 0);
		System.out.println(sum);

		// 3. Find count of elements equal to a given value
		int count = findCountInArray(array, 0, 3);
		System.out.println(count);
	}

	/**
	 * This recursive method prints array elements
	 *
	 * @param array array to print
	 * @param i index of the element to print
	 */
	public static void printArray(int[] array, int i) {
		if (i == array.length) {
			return;
		}
		System.out.println(array[i]);
		printArray(array, i + 1);
	}

	/**
	 * This recursive method calculates the sum of array elements
	 *
	 * @param array array to calculate sum
	 * @param i index of the element to calculate sum
	 */
	public static int arraySum(int[] array, int i) {
		if (i == array.length) {
			return 0;
		}
		return array[i] + arraySum(array, i + 1);
	}

	/**
	 * This recursive method calculates how many elements if an array are
	 * equal to a given value
	 *
	 * @param array array
	 * @param i index of the element to check
	 * @param what value to check
	 */
	public static int findCountInArray(int[] array, int i, int what) {
		if (i == array.length) {
			return 0;
		}
		return (array[i] == what ? 1 : 0) + findCountInArray(
				array, i + 1, what);
	}
}
