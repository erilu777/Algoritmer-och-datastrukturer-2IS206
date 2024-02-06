package algo.sum;

/**
 * Invokes algorithms with small values to help you establish that
 * your algorithm implementations are correct.
 */
public class AlgoSummarizer {
	/**
	 * Program entry point.
	 *
	 * @param args not used.
	 */
	public static void main(String[] args) {
		long[] n = { -5, 0, 1, 3, 5, 7, 9, 10, 15 };
		long[] sum = { 0, 0, 1, 6, 15, 28, 45, 55, 120 };
		long[] sumSquared = { 0, 0, 1, 14, 55, 140, 285, 385, 1240 };
		Summarizer summarizer = null;
		
		/*
		 * Testing SummarizerIterative
		 */
		summarizer = new SummarizerIterative();
		
		System.out.println("Testing SummarizerIterative");
		
		for(int i = 0; i < n.length; i ++) {
			long calculatedSum = summarizer.sumOfNaturalNumbers(n[i]);
			System.out.println("Sum of all natural numbers from 1 to " + n[i] + ": " + calculatedSum + ". Correct: " + (calculatedSum == sum[i]));
		}
		for(int i = 0; i < n.length; i ++) {
			long calculatedSum = summarizer.sumOfNaturalNumbersSquared(n[i]);
			System.out.println("Sum of all natural numbers squared from 1 to " + n[i] + ": " + calculatedSum + ". Correct: " + (calculatedSum == sumSquared[i]));
		}
		
		/*
		 * Testing SummarizerRecursive
		 */
		summarizer = new SummarizerRecursive();
		
		System.out.println("Testing SummarizerRecursive");

		for(int i = 0; i < n.length; i ++) {
			long calculatedSum = summarizer.sumOfNaturalNumbers(n[i]);
			System.out.println("Sum of all natural numbers from 1 to " + n[i] + ": " + calculatedSum + ". Correct: " + (calculatedSum == sum[i]));
		}
		for(int i = 0; i < n.length; i ++) {
			long calculatedSum = summarizer.sumOfNaturalNumbersSquared(n[i]);
			System.out.println("Sum of all natural numbers squared from 1 to " + n[i] + ": " + calculatedSum + ". Correct: " + (calculatedSum == sumSquared[i]));
		}
	}
}