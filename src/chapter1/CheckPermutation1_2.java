package chapter1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class CheckPermutation1_2 {

//	public static void main(String[] args) {
//
//		Scanner sc = new java.util.Scanner(System.in);
//		String str = sc.nextLine();
//		String str1 = sc.nextLine();
//		System.out.println(isPermutation(str, str1));
//
//	}

	private static boolean isPermutation(String str, String perm) {
		int ASCII = 256;
		HashMap<Character, Integer> hashMap = new HashMap<>(ASCII);
		int l1 = str.length();
		int l2 = perm.length();
		if (l1 != l2)
			return false;
		for (int i = 0; i < l1; i++) {
			hashMap.merge(str.charAt(i), 1, (old, newD) -> old + newD);
		}
		for (int i = 0; i < l2; i++) {
			if (!(hashMap.containsKey(perm.charAt(i))) || hashMap.get(perm.charAt(i)) == 0)
				return false;
			else {
				hashMap.merge(perm.charAt(i), 1, (old, newD) -> old - newD);
			}
		}
		return true;
	}

}
