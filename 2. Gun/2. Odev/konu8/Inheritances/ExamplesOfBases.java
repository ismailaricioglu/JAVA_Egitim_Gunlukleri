package Konular.konu8.Inheritances;

import java.util.Formatter;

public class ExamplesOfBases {

	public static void main(String[] args) {
		ExamplesOfBases inheritances = new ExamplesOfBases(1, -1, 0);
		inheritances.ekranaBas();
	}

	// Field || Attribute
	private int aInt = 0;
	int aInt2 = 0;
	public int aInt3 = 0;
	private int aInt4 = 0;

	// > Encapsulation Getter - Setter
	public int getAInt() {
		return aInt;
	}

	public void setAInt(int aInt) {
		this.aInt = aInt;
	}

	// Constructor
	// > default constructor
	public ExamplesOfBases() {

	}

	// > Overloading constructor examples
	public ExamplesOfBases(int... numbers) {
		
		System.out.println("Base sınıf işlemleri_");
		Formatter fmt = new Formatter();
		fmt.format("%20s %20s %20s  %20s\n", 
				"private int aInt",
				"int aInt2",
				"public int aInt3",
				"private int aInt4");
		System.out.println(fmt);
		for (int currentNumber : numbers) {
			setAInt(currentNumber);
			aInt2 = currentNumber;
			aInt3 = currentNumber;
			aInt4 = currentNumber;

			fmt = new Formatter();
			fmt.format("%20s %20s %20s  %20s\n", 
					this.aInt,
					this.aInt2,
					this.aInt3,
					this.aInt4);
			System.out.print(fmt);
		}
		ekranaBas();
	}
	
	public void ekranaBas() {
		System.out.println("Base sınıf işlemleri tamamlandı_");
	}

}