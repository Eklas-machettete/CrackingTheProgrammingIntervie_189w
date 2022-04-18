package chapter1;

import java.util.Scanner;

public class URLify1_3 {

//	public static void main(String[] args) {
//
//		Scanner sc = new java.util.Scanner(System.in);
//		String str = sc.nextLine();
//		char[] ch = str.toCharArray();
//		int l = sc.nextInt();
//		System.out.println(URLify(ch, l));
//
//	}

	private static char[] URLify(char[] ch, int length) {
		int n = 0;
		for (int i = 0; i < length; i++) {
			if (ch[i] == ' ') {
				n += 2;
			}
		}
		char[] ch1 = new char[length + n];

		int p = length + n - 1;
		for (int j = length - 1; j >= 0; j--) {
			if (ch[j] == ' ') {
				ch1[p] = '0';
				ch1[--p] = '2';
				ch1[--p] = '%';
			} else
				ch1[p] = ch[j];
			if (p >= 0)
				p--;
		}

		return ch1;
	}

}
