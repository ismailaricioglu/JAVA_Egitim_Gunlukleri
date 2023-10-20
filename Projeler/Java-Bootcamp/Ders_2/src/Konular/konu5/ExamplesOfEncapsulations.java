package Konular.konu5;

public class ExamplesOfEncapsulations {
	
	// Encapsulation - Kapsülleme

		// Genellikle erişime kapalı alan ve özelliklerin kapsüllemesi yapılır
	
	public static void main(String[] args) {
		ExamplesOfGettersAndSetters encapsulation = new ExamplesOfGettersAndSetters();
//		encapsulation.aInt = 10; // erişim hatası
//		encapsulation.aString = "aString özelliğinin içeriğine yeni değer atandı"; // erişim hatası
		encapsulation.setaInt(10);
		encapsulation.setaString("aString özelliğinin içeriğine yeni değer atandı");
//		System.out.println("Sınıfın aInt alanı (field) :" + encapsulation.aInt); // erişim hatası
//		System.out.println("Sınıfın aInt alanı (field) :" + encapsulation.aString); // erişim hatası
		System.out.println("Sınıfın aInt alanı (field) :" + encapsulation.getaInt());
		System.out.println("Sınıfın aString özelliği (attribute) :" + encapsulation.getaString());

	}
	
	
}