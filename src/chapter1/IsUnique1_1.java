package chapter1;

import java.util.HashSet;
import java.util.Scanner;

public class IsUnique1_1 {

//	public static void main(String[] args) {
//
//		Scanner sc = new java.util.Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(uniqueCharacter(str));
//
//	}

	public static Boolean uniqueCharacter(String str) {
		HashSet<Character> hashSet = new HashSet<>();
		int ASCII = 256;
		if (str.length() > ASCII)
			return false;
		for (int i = 0; i < str.length(); i++) {
			if (hashSet.contains(str.charAt(i)))
				return false;
			else
				hashSet.add(str.charAt(i));
		}

		return true;

	}

}
