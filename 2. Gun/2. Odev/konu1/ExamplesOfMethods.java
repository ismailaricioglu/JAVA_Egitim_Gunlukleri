package Konular.konu1;

public class ExamplesOfMethods {

	public static void main(String[] args) {

		methodNameByCamelCase();
		parameterMethods("Çalıştırıldığı yerden parametre alan ve geri bir değer döndürmeyen yöntem");
		variableArgumentsMethods("Bir ya da ", " birden çok ",
				"parametre veya dizi alan ve geri bir değer döndürmeyen yöntem");
		System.out.println(functions());
		System.out.println(parameterFunctions("Çalıştırıldığı yerden parametre alan ve geri değer döndüren yöntem"));
		System.out.println(variableArgumentsFunctions("Bir ya da ", " birden çok ",
				"parametre veya dizi alan ve geri değer döndüren yöntem/foksiyon"));

	}

	// Metotlar - Methods
	public static void methodNameByCamelCase() {
		System.out.println("Çalıştırıldığı yerde geri bir değer döndürmeyen yöntem");
	}

	// Parametreli Metotlar - Parameter Methods
	public static void parameterMethods(String aString) {
		System.out.println(aString);
	}

	// Değişken Argümanlı Metotlar - Variable Arguments Methods
	public static void variableArgumentsMethods(String... aStrings) {
		for (String aPart : aStrings) {
			System.out.print(aPart);
		}
		System.out.println();
	}
	
	// Fonksiyonlar - Fonctions
	public static String functions() {
		String aString = "Çalıştırıldığı yerde geri değer döndüren yöntem";
		return aString;
	}
	
	// Parametreli Fonksiyonlar - Parameter Fonctions
			public static String parameterFunctions(String aString) {
				String aStringResult = aString;
				return aStringResult;
			}
	
	// Değişken Argümanlı Fonksiyonlar - Variable Arguments Functions
		public static String variableArgumentsFunctions(String... aStrings) {
			String aString = "";
			for (String aPart : aStrings) {
				aString += aPart;
			}
			return aString;
		}
}
