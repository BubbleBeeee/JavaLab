package lab09.z5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		
		List<Integer> l2 = new ArrayList<>();
		
		l2.add(10);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		l2.add(16);
		l2.add(17);
		l2.add(18);
		l2.add(19);
		
		ListIterator<Integer> li = l1.listIterator();
		while (li.hasNext()) li.next(); // Ustaw kursor na koniec
		
		while (li.hasPrevious()) {
			l2.add(li.previous());
		}
		
		for (Integer i : l2) {
			System.out.println(i);
		}
	}
}
