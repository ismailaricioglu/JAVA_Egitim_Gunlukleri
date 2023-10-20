package Konular.konu1.Overriding;

public class ExamplesOfOverriding extends UzerineYazilacakAnaSinif {
	public static void main(String[] args) {
		ExamplesOfOverriding result = new ExamplesOfOverriding();
		result.run();
		result.msg();
		System.out.println(result.toString());
	}

//	ebeveyn sınıfındakiyle aynı yöntemi tanımlamak
//	Ana sınıf metodu geçersiz kılınıyor
	@Override
	public void run() {
//		this.run(); // çalışma zamanı hatası 
		System.out.println("Süper Sınıftan kalıtılan run metot değiştirilerek üzerine yeni eklenen kodlar çalıştı");
	}
//  Bu metot ana sınıfta korunmaktadır ve derleme zamanı hatası (compile time error)
	// void msg(){System.out.println("Hello java");}

	// Default Object methods - Nesne metotları

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Varsayılan nesne metodu ToString() override edilerek çağırıldı";
	}
}
