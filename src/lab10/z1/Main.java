package lab10.z1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
//  1.
//		ArrayList<Kangur> kangury = new ArrayList<>();
//		kangury.add(new Kangur(0));
//		kangury.add(new Kangur(1));
//		kangury.add(new Kangur(2));
//		kangury.add(new Kangur(3));
//		kangury.add(new Kangur(4));
//		kangury.add(new Kangur(5));
//		kangury.add(new Kangur(6));
//		kangury.add(new Kangur(7));
//		kangury.add(new Kangur(8));
//		kangury.add(new Kangur(9));
		
//		for (int i = 0; i < 10; i++) {
//			kangury.get(i).skok();
//		}

//  2.
//		Iterator<Kangur> iter = kangury.iterator();
//		while (iter.hasNext()) {
//			iter.next().skok();
//		}

//  3.
		HashMap<String, Kangur> kangury = new HashMap<>();
		kangury.put("Julian", new Kangur(0));
		kangury.put("Grzegorz", new Kangur(1));
		kangury.put("Filip", new Kangur(2));
		kangury.put("Dominik", new Kangur(3));
		kangury.put("Ignacy", new Kangur(4));
		kangury.put("Bartosz", new Kangur(5));
		kangury.put("Ernest", new Kangur(6));
		kangury.put("Horacy", new Kangur(7));
		kangury.put("Czeslaw", new Kangur(8));
		kangury.put("Adam", new Kangur(9));
		
		Iterator<String> ki = kangury.keySet().iterator();
		
		while (ki.hasNext()) {
			String imie = ki.next();
			Kangur k = kangury.get(imie);
			System.out.println("Imie: " + imie);
			k.skok();
			System.out.println();
		}

//  4.
		LinkedHashMap<String, Kangur> pary = new LinkedHashMap<>();
		kangury.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> pary.put(e.getKey(), e.getValue()));
		
		System.out.println("\n");
		for (String imie : pary.keySet()) {
			Kangur k = pary.get(imie);
			System.out.println("Imie: " + imie);
			k.skok();
			System.out.println();
		}
	}
}
