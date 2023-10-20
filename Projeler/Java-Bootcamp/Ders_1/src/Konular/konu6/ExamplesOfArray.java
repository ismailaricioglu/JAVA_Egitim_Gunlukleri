package Konular.konu6;

public class ExamplesOfArray {

	public static void main(String[] args) {

		OneDimensionalArrayAndUsagePatterns(0, 4, 2);
		MultiDimensionalArraysAndUsagePatterns();

	}

	// one-dimensional arrays and usage patterns
	public static void OneDimensionalArrayAndUsagePatterns(int aFirstInt, int aLastInt, int aRangeInt) {

		// K 1:
		System.out.println("_Kullanım 1: Tek Boyutlu Dizi Tanımlama");
		int[] aArrayInt = new int[aLastInt];
		for (int i = aFirstInt; i < aLastInt; i++) {
			aArrayInt[i] = i;
		}
		for (int aInt : aArrayInt)
			System.out.println("Sayı " + aInt);

		// K 2:
		System.out.println("\n_Kullanım 2: Tek Boyutlu Dizi Tanımlama");
		int[] aArrayInt2 = new int[aArrayInt.length];
		int count = 0;
		for (int aInt : aArrayInt) {
			aArrayInt2[count++] = aInt * aRangeInt;
		}
		for (int aInt : aArrayInt2)
			System.out.println("Sayı " + aInt);

		// K 3:
		System.out.println("\n_Kullanım 3: Tek Boyutlu Dizi Tanımlama");
		int[] aArrayInt3 = new int[] { 4, 5, 6, 7 };
		for (int aInt : aArrayInt3)
			System.out.println("Sayı " + aInt);

		// K 4:
		System.out.println("\n_Kullanım 4: Tek Boyutlu Dizi Tanımlama");
		int[] aArrayInt4 = { 8, 9, 10, 11 };
		for (int aInt : aArrayInt4)
			System.out.println("Sayı " + aInt);
	}

	// multidimensional arrays and usage patterns
	public static void MultiDimensionalArraysAndUsagePatterns() {

		// K 1:
		System.out.println("\n_Kullanım 1: Tek Boyutlu Dizi Tanımlama");
		int[][] aMultiDimensionalArrayInt = new int[2][3];
		aMultiDimensionalArrayInt[0][0] = 0;
		aMultiDimensionalArrayInt[0][1] = 1;
		aMultiDimensionalArrayInt[0][2] = 2;
		aMultiDimensionalArrayInt[1][0] = 3;
		aMultiDimensionalArrayInt[1][1] = 4;
		aMultiDimensionalArrayInt[1][2] = 5;
		for (int[] aArrayInt : aMultiDimensionalArrayInt)
			for (int aInt : aArrayInt)
				System.out.println("Sayı " + aInt);

		// K 2:
		System.out.println("\n_Kullanım 2: Tek Boyutlu Dizi Tanımlama");
		int[][] aMultiDimensionalArrayInt2 = new int[][] { { 6, 7 }, { 8, 9 } };
		for (int[] aArrayInt : aMultiDimensionalArrayInt2)
			for (int aInt : aArrayInt)
				System.out.println("Sayı " + aInt);

		// K 3:
		System.out.println("\n_Kullanım 3: Tek Boyutlu Dizi Tanımlama");
		int[][] aMultiDimensionalArrayInt3 = { { 10, 11 }, { 12, 13 } };
		for (int[] aArrayInt : aMultiDimensionalArrayInt3)
			for (int aInt : aArrayInt)
				System.out.println("Sayı " + aInt);
	}
}