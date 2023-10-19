package Konular.konu4;

public class ExamplesOfForAndForeach {

	public static void main(String[] args) {

		ForAndUsagePatterns(0, 10, 2);
		ForeachAndUsagePatterns();

	}

	// For and usage patterns
	public static void ForAndUsagePatterns(int aFirstInt, int aLastInt, int aRangeInt) {

		// K 1:
		System.out.println("_Kullanım 1:");
		for (int i = aFirstInt; i < aLastInt; i++)
			System.out.println(i + ". iş sırasında tek satır ile işlem çalıştı");

		// K 2:
		System.out.println("\n_Kullanım 2:");
		for (int i = aFirstInt; i < aLastInt; i++) {
			System.out.println(i + ". iş sırasında çok satır ile;");
			System.out.println("işlem çalıştı");
		}

		// K 3:
		System.out.println("\n_Kullanım 3:");
		for (int i = aFirstInt; i < aLastInt; i += aRangeInt)
			System.out.println(i + ". çift sayı iş sırasında işlem çalıştı");

		// K 4:
		System.out.println("\n_Kullanım 4:");
		for (int i = aLastInt; i > aFirstInt; i--)
			System.out.println(i + ". iş sırasında azalan şekilde işlem çalıştı");
	}

	// Foreach and usage patterns
	public static void ForeachAndUsagePatterns() {

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("\n_numbers dizisini okuma ve ekrana basma işlemi");
		for (int number : numbers) {
			System.out.println(" number değeri " + number + " ekrana basıldı");
		}
	}
}