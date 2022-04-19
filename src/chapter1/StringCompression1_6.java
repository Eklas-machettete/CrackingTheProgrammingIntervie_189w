package chapter1;

import java.util.Iterator;
import java.util.Scanner;

public class StringCompression1_6 {

	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(stringCompression(str));

	}

	private static StringBuilder stringCompression(String str) {
		Integer count = 1;
		if (compressedLength(str) > str.length())
			return new StringBuilder(str);
		StringBuilder compressed = new StringBuilder(compressedLength(str));

		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == prev) {
				count++;
			} else {
				compressed.append(prev + count.toString());
				prev = str.charAt(i);
				count = 1;
			}
		}
		compressed.append(prev + count.toString());
		return compressed.length() > str.length() ? new StringBuilder(str) : compressed;

	}

	public static int compressedLength(String str) {
		int count = 0;
		int compressedLength = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		return compressedLength;
	}

}
