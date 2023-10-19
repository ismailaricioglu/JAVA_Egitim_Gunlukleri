package Konular.konu1.Overriding.Exceptions;

//import java.io.IOException;

public class ExamplesOfOverridingsByExceptions extends UzerineYazilacakAnaSinif {

	public static void main(String[] args) throws Exception {
		ExamplesOfOverridingsByExceptions result = new ExamplesOfOverridingsByExceptions();
		result.msg1(); // UzerineYazilacakAnaSinif tan çalışır
		result.msg2(); // ExamplesOfOverridingsByExceptions tan çalışır
		result.msg3(); // UzerineYazilacakAnaSinif tan çalışır
		result.msg4(); // ExamplesOfOverridingsByExceptions tan çalışır
		result.msg5(); // ExamplesOfOverridingsByExceptions tan çalışır
		result.msg6(); // ExamplesOfOverridingsByExceptions tan çalışır
	}
	
//	Eğer ana sınıf yöntemi (metodu) bir istisna bildirmezse
//    	geçersiz kılınan (overriding) kalıtım alan sınıf yöntemi kontrol edilen istisnayı bildiremez
//    	ancak kontrol edilmeyen istisnayı bildirebilir.
//	
//  Eğer ana sınıf yöntemi (metodu) bir istisna bildirirse
//    	geçersiz kılınan (overriding) kalıtım alan sınıf yöntemi aynı şeyi bildirebilir,
//    	kalıtım alan sınıf istisnası veya istisna yok ancak ana sınıf istisnası bildirilemez.
	
//	derleme zamanı hatası (compile time error)
//    void msg1 () throws IOException {System.out.println("Kalıtım alan Sınıf içerisinde istisnası çalıştı");}
    void msg2 () throws ArithmeticException {System.out.println("Kalıtım alan Sınıf içerisinde istisnası çalıştı");}
//	derleme zamanı hatası (compile time error)
//    void msg3() throws Exception {System.out.println("Kalıtım alan Sınıf içerisinde istisnası çalıştı");}
    void msg4() throws Exception {System.out.println("Kalıtım alan Sınıf içerisinde istisnası çalıştı");}
    void msg5() throws ArithmeticException {System.out.println("Kalıtım alan Sınıf içerisinde istisnası çalıştı");}
    void msg6() {System.out.println("Kalıtım alan Sınıf içerisinde istisna bildirilmeden çalıştı");}
}
