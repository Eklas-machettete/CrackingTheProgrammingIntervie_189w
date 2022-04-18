package chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromePermutation1_4 {
	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindromePermutation(str));

	}

	private static boolean isPalindromePermutation(String str) {
		str = str.toLowerCase().replaceAll("\\s", "");
		int ASCIILowerCase = 26;
		int oddCount = 0;
		Map<Character, Integer> hasMap = new HashMap<Character, Integer>(ASCIILowerCase);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				hasMap.merge(str.charAt(i), 1, (old, newD) -> old + newD);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (hasMap.get(str.charAt(i)) % 2 != 0) {
				oddCount++;
				if (oddCount > 1)
					return false;
			}
		}

		return true;
	}
}
