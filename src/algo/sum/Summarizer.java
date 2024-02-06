package algo.sum;
/**
 * Algorithmic methods to calculate sum.
 */
public interface Summarizer {
	/**
	 * Returns the sum of all natural numbers from 1 to n.
	 * If n = 4, the method will return 10 (1 + 2 + 3 + 4).
	 *
	 * @param n number of natural numbers to sum
	 * @return sum of all natural numbers
	 */
	long sumOfNaturalNumbers(long n);
	/**
	 * Returns the sum of all natural numbers squared from 1 to n.
	 * If n = 4, the method will return 30 (1^2 + 2^2 + 3^2 + 4^2).
	 * 
	 * @param n number of natural numbers squared to sum
	 * @return sum of all natural numbers squared
	 */
	long sumOfNaturalNumbersSquared(long n);
}