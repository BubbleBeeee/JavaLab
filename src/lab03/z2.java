package lab03;

import java.util.Scanner;

public class z2 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		System.out.println("Podaj 10 liczb:");
		
		int countn = 0, countp = 0;
		int sumn = 0, sump = 0;
		
		for (int i = 0; i < 10; i++) {
			int x = InInt();
			
			if (x < 0) {
				countn++;
				sumn += x;
			}
			else if (x > 0) {
				countp++;
				sump += x;
			}
		}
		
		System.out.printf("""
				Ujemne:
					Liczba:	%d
					Suma:	%d
				Dodatnie:
					Liczba:	%d
					Suma:	%d
				%n""", countn, sumn, countp, sump);
	}
	
	public static int InInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}
