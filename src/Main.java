/*
 * Manny Peterson's Solution to Project Euler Problem #5
 * https://projecteuler.net/problem=5
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	private static boolean isDivisible(int n, int start, int finish) {
		for (int i = start; i <= finish; i++)
			if (n % i != 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		int i;
		for (i = 21; i > 0; i++)
			if (Main.isDivisible(i, 1, 20))
				break;
		System.out.format("ANSWER = %d\n", i);
	}
}