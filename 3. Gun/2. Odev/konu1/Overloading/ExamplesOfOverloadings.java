package Konular.konu1.Overloading;

public class ExamplesOfOverloadings extends AsiriYuklenecekAnaSinif {

	public static void main(String[] args) {
		ExamplesOfOverloadings result = new ExamplesOfOverloadings();
		result.anaSinifMetodu("Ana sınıftan kalıtım alan metodu çalıştı");
		result.parametreTuruIleMethod(2147483647);
		result.parametreTuruIleMethod(9223372036854775807l);
	}

	public ExamplesOfOverloadings() {
		System.out.println("Ana Sınıftan kalıtım alan sınıf yapıcısında çalıştı");
	}

	public void anaSinifMetodu(String aString) { // geliştirilmek istenen metot ile isim ve/veya parametre farkı olmalı
		this.anaSinifMetodu(); // burada ana sınıftan gerçekleştirilen metot çalıştırılmakta
		// ana sınıfın metodu geliştirilmekte
		System.out.println("Geliştirilen yöntem : " + aString);
	}

	public int sinifIciMetot(int a, int b) {
		return a + b;
	}

	// public double sinifIciMetot(int a,int b){return a+b;} // belirsilik & derleme zamanı
	// hatası (compile time error)

	// Parametre türüne göre
	public void parametreTuruIleMethod(int aVariable) {
		System.out.println("Değişken türü int ");
	}

	public void parametreTuruIleMethod(long aVariable) {
		System.out.println("Eğer sayı int'i aşarsa, değişkenin türü long'dur");
	}

//	Değişkenler arasında öncelik hiyer arşisi;

//    double 	> float   long    int     char    short   byte
//    float 	> long    int     char    short   byte
//    long 		> int     char    short   byte
//    int 		> char    short   byte
//    char
//    short 	> byte

//	NOT	: Yöntemde (metotta) eşleşen tür bağımsız değişkenleri yoksa
//	ve her yöntem benzer sayıda argümanı destekler ise
//	belirsizlik olacaktır.

}
