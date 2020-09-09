package person.pack;

import java.util.Scanner;

public class LexicalOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string    :\n");
		String s = scan.nextLine();
		System.out.println("Enter the substring code    :\n");
		int k = scan.nextInt();

		String returnValue = getSmallestAndLargest(s, k);
		System.out.println(returnValue);

	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		for (int i = 0; i <= s.length() - k; i++) {
			//System.out.println(s.substring(i, i + k));
			String temp = s.substring(i, i + k);
			if (largest.compareTo(temp) < 0) {
				largest = temp;

			}

		}
		smallest = largest;
		for (int j = 0; j <= s.length() - k; j++) {
			//System.out.println(s.substring(j, j + k));
			String temp = s.substring(j, j + k);
			if (smallest.compareTo(temp) > 0) {
				smallest = temp;

			}

		}
		
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

}
