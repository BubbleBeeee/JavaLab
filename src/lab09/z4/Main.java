package lab09.z4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		DowolnaKlasa[] tab = new DowolnaKlasa[] {
				new DowolnaKlasa(0),
				new DowolnaKlasa(1),
				new DowolnaKlasa(2),
				new DowolnaKlasa(3),
				new DowolnaKlasa(4),
				new DowolnaKlasa(5),
				new DowolnaKlasa(6),
				new DowolnaKlasa(7),
				new DowolnaKlasa(8)
		};
		
		List<DowolnaKlasa> list = new ArrayList<>(Arrays.asList(tab));
		
		for (DowolnaKlasa d : list) {
			System.out.println(d.toString());
		}
		
		List<DowolnaKlasa> subList = list.subList(2, 5);
		
		list.removeAll(subList);
		
		System.out.println();
		for (DowolnaKlasa d : list) {
			System.out.println(d.toString());
		}
	}
}
