package lab03;

import java.util.Scanner;

public class z5 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		System.out.println("Podaj słowo:");
		String str = InString();
		
		if (IsPalindrome(str))
			System.out.println("To słowo jest palindromem!");
		else
			System.out.println("To słowo nie jest palindromem!");
	}
	
	public static boolean IsPalindrome(String string) {
		char[] chars = string.toCharArray();
		int len = chars.length;
		
		for (int i = 0; i < len / 2; i++) {
			if (chars[i] != chars[len - 1 - i])
				return false;
		}
		
		return true;
	}
	
	public static String InString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
