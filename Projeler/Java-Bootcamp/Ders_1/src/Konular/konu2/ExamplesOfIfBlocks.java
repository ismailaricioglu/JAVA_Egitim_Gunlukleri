package Konular.konu2;

public class ExamplesOfIfBlocks {

	public static void main(String[] args) {

		IfElseAndUsagePatterns();

	}

	static boolean aTrue = true, aFalse = false;

	// Eğer bloğu kullanım kalıpları - İf blok and usage patterns
	public static void IfElseAndUsagePatterns() {

		// K 1:
		System.out.println("_Kullanım 1:");
		if (aTrue)
			System.out.println("tek satır ile koşullu işlem çalıştı");

		// K 2:
		System.out.println("\n_Kullanım 2:");
		if (aTrue) {
			System.out.println("çok satır ile,");
			System.out.println("koşullu işlem çalıştı");
		}

		// K 3:
		System.out.println("\n_Kullanım 3:");
		if (aFalse)
			System.out.println("...");
		else if (aFalse)
			System.out.println("sonraki koşullu işlem çalıştı");

		// K 4:
		System.out.println("\n_Kullanım 4:");
		if (aFalse)
			System.out.println("...");
		else
			System.out.println("koşulsuz işlem çalıştı");

		// K 5:
		System.out.println("\n_Kullanım 5:");
		if (aFalse)
			System.out.println("...");
		else if (aFalse)
			System.out.println("...");
		else
			System.out.println("koşulsuz işlem çalıştı");

	}
}