package algo.sum;
/**
 * Algorithmic methods to calculate sum using recursive solutions.
 */
public class SummarizerRecursive implements Summarizer {
	
	/**
	 * Returns the sum of all natural numbers from 1 to n.
	 * If n = 4, the method will return 10 (1 + 2 + 3 + 4).
	 *
	 * @param n number of natural numbers to sum
	 * @return sum of all natural numbers
	 */
	@Override
	public long sumOfNaturalNumbers(long n) {
		//Base case n = 1
	    if (n == 1) {
	        return 1;
	    } else if(n > 1) {
	        return n + sumOfNaturalNumbers(n - 1);
	    }
	    return 0;
	}
	
	/**
	 * Returns the sum of all natural numbers squared from 1 to n.
	 * If n = 4, the method will return 30 (1^2 + 2^2 + 3^2 + 4^2).
	 * 
	 * @param n number of natural numbers squared to sum
	 * @return sum of all natural numbers squared
	 */
	@Override
	public long sumOfNaturalNumbersSquared(long n) {
		//Base case n = 1
	    if (n == 1) {
	        return 1;
	    } else if(n > 1) {
	        return (n*n + sumOfNaturalNumbersSquared(n - 1));
	    }
	    return 0;
	}
}