package Konular.konu7;

public class ExamplesOfOverloadings {

	public static void main(String[] args) {
		ExamplesOfOverloadings constructors = new ExamplesOfOverloadings();
		System.out.println("Sınıfın aInt alanı (field) :" + constructors.aInt);
		System.out.println("Sınıfın aString özelliği (attribute) :" + constructors.aString);
		System.out.println();
		ExamplesOfOverloadings constructors2 = new ExamplesOfOverloadings(
				"aString özelliğinin içeriğine yeni değer atandı");
		System.out.println("Sınıfın aInt alanı (field) :" + constructors2.aInt);
		System.out.println("Sınıfın aString özelliği (attribute) :" + constructors2.aString);
		System.out.println();
		ExamplesOfOverloadings constructors3 = new ExamplesOfOverloadings(10,
				"aString özelliğinin içeriğine yeni değer atandı");
		System.out.println("Sınıfın aInt alanı (field) :" + constructors3.aInt);
		System.out.println("Sınıfın aString özelliği (attribute) :" + constructors3.aString);
		System.out.println();
		constructors.methods();
		constructors.methods("Sınıfın tek Parametreli Methods metodu çalıştı");
		constructors.methods(3, "Sınıfın çok (sayısız) Parametreli Methods metodu çalıştı");
		System.out.println();
		System.out.println(constructors.fuctions());
		System.out.println(constructors.fuctions("Sınıfın tek Parametreli Fuctions metodu çalıştı"));
		System.out.println(constructors.fuctions(3, "Sınıfın çok (sayısız) Parametreli Fuctions metodu çalıştı"));

	}

	// Overloading : Aşırı yüklenmiş yapılandırıcı, metot veya fonksiyon
	// İsimleri aynıdır
	// Farklı Parametreler alarak aşırı yükleme yapılır
	// public static void main(String[] args) ana metodu aşırı yüklenemez, 
	// 		eğer ana metot öncesinde bir metot çalıştırılmak isteniyor ise
	//		isimsiz static bir metot yazılabilir. Detaylar için static konusuna bakınız 

	int aInt = 0; // Fields
	String aString; // Attributes

	// Constructor : varsayılan
	public ExamplesOfOverloadings() {
		System.out.println("Sınıfın Yapılandırıcı metodu çalıştı");
	}

	// Constructor : Aşırı yüklenmiş
	public ExamplesOfOverloadings(String aString) {
		this.aString = aString;
		System.out.println("Sınıfın tek Parametreli Yapılandırıcı metodu çalıştı");
	}

	// Constructor : Aşırı yüklenmiş
	public ExamplesOfOverloadings(Object... object) {
		this.aInt = (int) object[0];
		this.aString = (String) object[1];
		System.out.println("Sınıfın çok (sayısız) Parametreli Yapılandırıcı metodu çalıştı");
	}

	// Methods : varsayılan
	public void methods() {
		System.out.println("Sınıfın Methods metodu çalıştı");
	}

	// Methods : Aşırı yüklenmiş
	public void methods(String aString) {
		this.aString = aString;
		System.out.println(aString);
	}

	// Methods : Aşırı yüklenmiş
	public void methods(Object... object) {
		this.aInt = (int) object[0];
		this.aString = (String) object[1];
		for (int i = 1; i <= aInt; i++) {
			System.out.println(i + ". satır : " + aString);
		}
	}

	// Fuctions : varsayılan
	public String fuctions() {
		return "Sınıfın Fuctions metodu çalıştı";
	}

	// Fuctions : Aşırı yüklenmiş
	public String fuctions(String aString) {
		this.aString = aString;
		return aString;
	}

	// Fuctions : Aşırı yüklenmiş
	public String fuctions(Object... object) {
		this.aInt = (int) object[0];
		this.aString = (String) object[1];
		String result = "";
		for (int i = 1; i <= aInt; i++) {
			result += (i + ". satır : " + aString + "\n").toString();
		}
		return result;
	}

}