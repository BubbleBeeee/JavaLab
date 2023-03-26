package lab04;

public class z2 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8};
		EveryOther(tab1);
		
		int[] tab2 = {9, 8, 7, 6, 5, 4, 3};
		EveryOther(tab2);
	}
	
	public static void EveryOther(int[] tab) {
		for (int i = 0; i < tab.length; i+=2) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
}
