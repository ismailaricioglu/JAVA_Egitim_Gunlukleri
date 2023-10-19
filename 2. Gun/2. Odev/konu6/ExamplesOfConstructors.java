package Konular.konu6;

public class ExamplesOfConstructors {

	public static void main(String[] args) {
		ExamplesOfConstructors constructors = new ExamplesOfConstructors();
		System.out.println("Sınıfın aInt alanı (field) :" + constructors.aInt);
		System.out.println("Sınıfın aString özelliği (attribute) :" + constructors.aString);
	}
	
	// Constructor : Yapılandırıcı

	//	Her sınıfın varsayılan bir yapılandırıcı metodu vardr
	//	Yapılandırıcılar geliştirilebilir
	// 	Metotlardan farkı belirtecinin public olması ve void ya da dönen tip olmamasıdır

	int aInt = 0; // Fields
	String aString; // Attributes

	// Constructor : varsayılan yapılandırıcıyı geliştirmek
	public ExamplesOfConstructors() {
		System.out.println("Sınıfın Yapılandırıcı metodu çalıştı");
	}
	
}