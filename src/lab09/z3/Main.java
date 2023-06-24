package lab09.z3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		//LinkedList
//		LinkedList<Uczestnik> uczestnicy = new LinkedList<>();
//
//		uczestnicy.add(new Uczestnik("1", "Adam", 20));
//		uczestnicy.add(new Uczestnik("2", "Beata", 17));
//		uczestnicy.add(new Uczestnik("3", "Czeslaw", 34));
//		uczestnicy.add(new Uczestnik("4", "Dominik", 16));
//		uczestnicy.add(new Uczestnik("5", "Ernest", 18));
//		uczestnicy.add(new Uczestnik("6", "Filip", 13));
//
//		for (Uczestnik u : uczestnicy) {
//			System.out.println(u.toString());
//		}
//
//		System.out.println("\nTylko Pelnoletni:");
//
//		uczestnicy = tylkoPelnoletni(uczestnicy);
//
//		for (Uczestnik u : uczestnicy) {
//			System.out.println(u.toString());
//		}
		
		//ArrayList
		ArrayList<Uczestnik> uczestnicy = new ArrayList<>();

		uczestnicy.add(new Uczestnik("1", "Adam", 20));
		uczestnicy.add(new Uczestnik("2", "Beata", 17));
		uczestnicy.add(new Uczestnik("3", "Czeslaw", 34));
		uczestnicy.add(new Uczestnik("4", "Dominik", 16));
		uczestnicy.add(new Uczestnik("5", "Ernest", 18));
		uczestnicy.add(new Uczestnik("6", "Filip", 13));

		for (Uczestnik u : uczestnicy) {
			System.out.println(u.toString());
		}

		System.out.println("\nTylko Pelnoletni:");

		uczestnicy = tylkoPelnoletni(uczestnicy);

		for (Uczestnik u : uczestnicy) {
			System.out.println(u.toString());
		}
	}
	
	static LinkedList<Uczestnik> tylkoPelnoletni(LinkedList<Uczestnik> uczestnicy) {
		return uczestnicy.stream().filter(Uczestnik::czyPelnoletni).collect(Collectors.toCollection(LinkedList::new));
	}
	
	static ArrayList<Uczestnik> tylkoPelnoletni(ArrayList<Uczestnik> uczestnicy) {
		return uczestnicy.stream().filter(Uczestnik::czyPelnoletni).collect(Collectors.toCollection(ArrayList::new));
	}
}
