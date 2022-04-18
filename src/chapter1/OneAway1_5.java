package chapter1;

import java.util.Scanner;

public class OneAway1_5 {
	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println(isOneEdited(str, str1));

	}

	private static boolean isOneEdited(String str, String str1) {
		int l1 = str.length();
		int l2 = str1.length();
		int diff = l1 - l2;
		if (diff == 1 || diff == -1 || diff == 0) {
		} else
			return false;
		int oneEdit = 0;
		int i = 0;
		int j = 0;

		while (i < l1) {
			if (i == l1 - 1 && j == l2 && oneEdit == 0)
				return true;
			if (j == l2 - 1 && i == l1 && oneEdit == 0)
				return true;
			if (str.charAt(i) != str1.charAt(j)) {
				oneEdit++;
				if (l2 > l1) {
					j += 2;
				} else if (l2 < l1) {
					i += 2;
				}
				if (oneEdit > 1)
					return false;
			}
			i++;
			j++;
		}
		return true;
	}
}
