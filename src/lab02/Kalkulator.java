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
				"""
						\t\t\t--------------------
						\t\t\t---- Kalkulator ----
						\t\t\t--------------------
						"""
		);
		System.out.println(
				"""
						\t\t\t1. Suma
						\t\t\t2. Różnica
						\t\t\t3. Iloczyn
						\t\t\t4. Iloraz
						\t\t\t5. Potęga
						\t\t\t6. Pierwiastek
						\t\t\t7. Funkcja Trygonometryczna
						\t\t\t8. Wyjście"""
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
	
	public static void Add() {
		System.out.println("Podaj liczby do dodania: ");
		int a = InInt();
		int b = InInt();
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	public static void Sub() {
		System.out.println("Podaj liczby do odjęcia: ");
		int a = InInt();
		int b = InInt();
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	
	public static void Mul() {
		System.out.println("Podaj liczby do pomnożenia: ");
		int a = InInt();
		int b = InInt();
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	
	public static void Div() {
		System.out.println("Podaj licznik: ");
		int a = InInt();
		
		System.out.println("Podaj mianownik: ");
		int b = InInt();
		
		System.out.println(a + " / " + b + " = " + (float)a/b);
	}
	
	public static void Exp() {
		System.out.println("Podaj podstawę: ");
		int a = InInt();
		
		System.out.println("Podaj wykładnik: ");
		int b = InInt();
		
		System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
	}
	
	public static void Root() {
		System.out.println("Podaj liczbę do spierwiastkowania: ");
		int a = InInt();
		
		System.out.println("Podaj stopień pierwiastka: ");
		int b = InInt();
		
		System.out.println(a + " ^ 1/" + b + " = " + Math.pow(a, 1.0/b));
	}
	
	public static void Trig() {
		System.out.println("Podaj miarę kąta w stopniach: ");
		double phi = InInt() / 360.0 * 2 * Math.PI;
		
		System.out.println("""
				Wybierz funkcję:
				1. Sin
				2. Cos
				3. Tan
				4. Ctg""");
		
		int choice = InInt();
		
		switch (choice) {
			case 1 -> System.out.println(Math.sin(phi));
			case 2 -> System.out.println(Math.cos(phi));
			case 3 -> System.out.println(Math.tan(phi));
			case 4 -> System.out.println(1.0 / Math.tan(phi));
			default -> System.out.println("Nieprawidłowy wybór!");
		}
	}
	
	public static void Close() {
		System.exit(0);
	}
	
	public static void Err() {
		System.out.println("Nieprawidłowy wybór!");
	}
}
