package abs.pack.config;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String s1 = s.trim();
		if (s1.equals("")) {
			System.out.println(0);
		} else {
			String[] words = s1.split("[!,?._'@ \\s]+");

			System.out.println(words.length);
			for (String w : words) {
				System.out.println(w);
			}
		}
		scan.close();
	}
}
