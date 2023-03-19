package lab02;

import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		while (true) {
			Menu();
		}
	}
	
	public static void Menu() {
		System.out.println(
				"\t\t\t--------------------\n" +
						"\t\t\t---- Kalkulator ----\n" +
						"\t\t\t--------------------\n"
		);
		System.out.println(
				"\t\t\t1. Suma\n" +
						"\t\t\t2. Różnica\n" +
						"\t\t\t3. Iloczyn\n" +
						"\t\t\t4. Iloraz\n" +
						"\t\t\t5. Potęga\n" +
						"\t\t\t6. Pierwiastek\n" +
						"\t\t\t7. Funkcja Trygonometryczna\n" +
						"\t\t\t8. Wyjście"
		);
		
		int choice = InInt();
		
		switch (choice) {
			case 1 -> Add();
			case 2 -> Sub();
			case 3 -> Mul();
			case 4 -> Div();
			case 5 -> Exp();
			case 6 -> Root();
			case 7 -> Trig();
			case 8 -> Close();
			default -> Err();
		}
	}
	
	public static int InInt() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static String InString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	public static void Add() {
	
	}
	
	public static void Sub() {
	
	}
	
	public static void Mul() {
	
	}
	
	public static void Div() {
	
	}
	
	public static void Exp() {
	
	}
	
	public static void Root() {
	
	}
	
	public static void Trig() {
	
	}
	
	public static void Close() {
		System.exit(0);
	}
	
	public static void Err() {
		System.out.println("Nieprawidłowy wybór!");
	}
}
