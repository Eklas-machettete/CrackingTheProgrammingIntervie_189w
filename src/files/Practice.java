package files;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		String str = sc.nextLine();
        str=str.toLowerCase().replaceAll(" ", "");
		System.out.println(str);
	}
	
	
}
