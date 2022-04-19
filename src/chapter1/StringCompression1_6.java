package chapter1;

import java.util.Scanner;

public class StringCompression1_6 {

//	public static void main(String[] args) {
//
//		Scanner sc = new java.util.Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(stringCompression(str));
//
//	}

	private static StringBuilder stringCompression(String str) {

		Integer count = 1;
		StringBuilder compressed = new StringBuilder("");

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

}
