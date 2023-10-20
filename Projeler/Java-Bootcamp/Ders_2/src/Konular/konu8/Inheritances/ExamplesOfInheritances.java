package Konular.konu8.Inheritances;

import java.util.Formatter;

public class ExamplesOfInheritances extends ExamplesOfBases {
	public static void main(String[] args) {
		ExamplesOfInheritances inheritances = new ExamplesOfInheritances(1, -1, 0);
		inheritances.ekranaBas();
	}

	// > Overloading constructor examples
	public ExamplesOfInheritances(int... numbers) {
		
		super(numbers);
		
		System.out.println("Kalıtım alan sınıf işlemleri_");
		Formatter fmt = new Formatter();
		fmt.format("%20s %20s %20s  %20s\n", 
				"private int aInt",
				"int aInt2",
				"public int aInt3",
				"private int aInt4");
		System.out.println(fmt);
		for (int currentNumber : numbers) {
			setAInt(currentNumber);
			super.aInt2 = currentNumber;
			super.aInt3 = currentNumber;
//			super.aInt4 = currentNumber; // private olduğu için bu mirasçı kullanamıyor

			fmt = new Formatter();
			fmt.format("%20s %20s %20s  %20s\n", 
					super.getAInt(),
					super.aInt2,
					super.aInt3,
					"kullanılamaz");//, super.aInt4); // private olduğu için bu mirasçı kullanamıyor
			System.out.print(fmt);
		}
	}
	
	@Override
	public void ekranaBas() {
		System.out.println("ekranaBas() metodu geçersiz kılındı ve Kalıtım alan sınıf işlemleri tamamlandı_");
	}
}
