package lab02;

public class zd5 {
	public static void main(String[] args) {
		Run();
	}
	
	public static void Run() {
		for (int i = 20; i >= 0; i--) {
			if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19)
				continue;
			System.out.println(i);
		}
	}
}
