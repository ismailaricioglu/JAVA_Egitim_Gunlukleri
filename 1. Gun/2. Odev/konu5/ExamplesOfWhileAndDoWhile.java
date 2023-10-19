package Konular.konu5;

public class ExamplesOfWhileAndDoWhile {

	public static void main(String[] args) {

		WhileAndUsagePatterns(1);
		DoWhileAndUsagePatterns(1);

	}

	static boolean aTrue = true, aFalse = false;

	// While and usage patterns
	public static void WhileAndUsagePatterns(int number) {

		// K 1:
		System.out.println("_Kullanım 1: while");
		while (number > 0)
			System.out.println("Sayı " + (number--) + " ile tek satır çalıştı");

		// K 2:
		System.out.println("\n_Kullanım 2: while");
		while (number < 5) {
			System.out.println("Sayı " + number);
			number++;
		}

		// K 3:
		System.out.println("\n_Kullanım 3: while");
		while (number > 1) {
			System.out.println("Sayı " + number);
			number--;
		}

		// K 4:
		System.out.println("\n_Kullanım 4: while");
		while (aTrue) {
			System.out.println(number + " Döngüde mutlak çalışan alan");
			if (number > 5) {
				System.out.println("Döngünün sonlandırıldığı alan ** **** **");
				break;
			}
			System.out.println("Döngü devam ediyor");
			number++;
		}

		// K 5:
		System.out.println("\n_Kullanım 5: while");
		while (number > 0) {
			number--;
			if ((number % 2) == 0)
				continue;
			System.out.println("Tek sayı " + number);
		}
	}

	// Do-While and usage patterns
	public static void DoWhileAndUsagePatterns(int number) {

		// K 1:
		System.out.println("\n_Kullanım 1: do-while");
		do {
			System.out.println("Döngüde en az bir defa mutlak çalışan alan");
			number++;
		} while (number < 1);
	}
}