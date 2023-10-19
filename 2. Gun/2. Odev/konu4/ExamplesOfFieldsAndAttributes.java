package Konular.konu4;

public class ExamplesOfFieldsAndAttributes {

	public static void main(String[] args) {
		System.out.println("Sınıfın aInt alanı (field) :" + aInt);
		System.out.println("Sınıfın aString özelliği (attribute) :" + aString);
	}

	// Fields & Attributes - Alanlar & Özellikler

		// Varsayılan erişim belirteci (public) herkese açıktır
		// Fields : ilkel veri tipleri için kullanılabilir
		// Attributes : İlkel olmayan veritiplri (kümülatif ilkel veri tipleri) için
		// kullanılabilir

	static int aInt = 0; // Fields
	static String aString; // Attributes
}