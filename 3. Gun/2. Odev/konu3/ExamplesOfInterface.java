package Konular.konu3;

public class ExamplesOfInterface {

	public static void main(String[] args) {
		System.out.println("\n* interface static method *\n");
		BaseInterface.staticMethod();
		System.out.println(BaseInterface.staticFunction());

//		Derleme zmanı hatası
//		ExtendInterface.staticMethod();
//		ExtendInterface.staticFunction();

		System.out.println("\n* BaseInterface implement *\n");
		BaseInterface bIImplementClass = new ImplementClass();
//		bIImplementClass.InterfaceConstVariable(); // BaseInterface içerisinde bu metot olmadığı için derleme zamanı hatası
		bIImplementClass.baseInterfaceMethod();
		bIImplementClass.privateBIMethod();
		System.out.println(bIImplementClass.privateBIFunction());
//		bIImplementClass.extendInterfaceMethod(); // ExtendInterface erişim olmadığı için derleme zanaı hatası
		bIImplementClass.defaultMethod();
		System.out.println(bIImplementClass.defaultFunction());

		System.out.println("\n* ExtendInterface implement *\n");
		ExtendInterface eIImplementClass = new ImplementClass();
//		eIImplementClass.InterfaceConstVariable(); // ExtendInterface içerisinde bu metot olmadığı için derleme zamanı hatası
		eIImplementClass.baseInterfaceMethod();
//		eIImplementClass.privateBIMethod(); //  BaseInterface içerisinde bu metot private olduğu için derleme zanaı hatası
//		System.out.println(eIImplementClass.privateBIFunction()); //  BaseInterface içerisinde bu foksiyon private olduğu için derleme zanaı hatası
		eIImplementClass.extendInterfaceMethod();
		eIImplementClass.defaultMethod();
		System.out.println(eIImplementClass.defaultFunction());
		
		System.out.println("\n* ImplementClass implement *\n");
		ImplementClass implementClass = new ImplementClass();
		implementClass.InterfaceConstVariable();
		implementClass.baseInterfaceMethod();
//		implementClass.privateBIMethod(); //  BaseInterface içerisinde bu metot private olduğu için derleme zanaı hatası
//		System.out.println(implementClass.privateBIFunction()); //  BaseInterface içerisinde bu foksiyon private olduğu için derleme zanaı hatası
		implementClass.extendInterfaceMethod();
		implementClass.defaultMethod();
		System.out.println(implementClass.defaultFunction());
	}

//	Temel arayüz örneği
	public interface BaseInterface {

//		Fields - bidirim : sabit alanlar

		String aString = "BaseInterface String aString sabit (constant) değişkeni";

//		Methods - bidirim : soyutlayan yöntemler

		void baseInterfaceMethod();
		
		// Java 9 iyileştirmesi: Private Method - Function
		private void privateBIMethod() { 
			System.out.println("BaseInterface private method çağırıldı");
		};
		
		private String privateBIFunction() { 
			return "BaseInterface private function çağırıldı";
		};

		// Java 8 iyileştirmesi: Static & Default
		// Static Method - Function
		static void staticMethod() {
			System.out.println("BaseInterface static method çağırıldı");
		}

		static String staticFunction() {
			return "BaseInterface static function çağırıldı";
		}

		// Default Method - Function
		default void defaultMethod() {
			System.out.println("BaseInterface default method çağırıldı");
		}

		default String defaultFunction() {
			return "BaseInterface default function çağırıldı";
		}
	}

//	Diğer Temel arayüz örneği
	public interface OtherInterface {

		// by default.

		// Default Method - Function
		default void defaultMethod() {
			System.out.println("OtherInterface default method çağırıldı");
		}

		default String defaultFunction() {
			return "OtherInterface default function çağırıldı";
		}
	}

//	Genişlemiş arayüz örneği
	public interface ExtendInterface extends BaseInterface {

		void extendInterfaceMethod();

		// Java 8 ile gelen Static & Default
		// Default Method - Function
//		@Override
		default void defaultMethod() {
			System.out.println("ExtendInterface'de override edilmiş defaultMethod çağırıldı");
		}

//		@Override
		default String defaultFunction() {
			return "ExtendInterface'de override edilmiş defaultFunction çağırıldı";
		}
	}

//	İşaretleyici veya etiketli arayüz örneği
	public interface Serializable {
	}

//	Uygulama sınıf örneği
	public static class ImplementClass implements ExtendInterface, OtherInterface {

		public void InterfaceConstVariable() {
			System.out.println(aString);

		}

		@Override
		public void baseInterfaceMethod() {
			System.out.println("ImplementClass'de baseInterfaceMethod override edilmiş metot çağırıldı");
		}

		@Override
		public void extendInterfaceMethod() {
			System.out.println("ImplementClass'de extendInterfaceMethod override edilmiş metot çağırıldı");
		}

		// aynı imzaya sahip default metot ve fonksiyonların gövdesi kalıtım alacak ise
		// mutlaka hangi arayüz olduğu bildirilmelidir
		@Override
		public void defaultMethod() {
			System.out.println("ImplementClass'da override edilmiş defaultMethod çağırıldı");
			ExtendInterface.super.defaultMethod();
			OtherInterface.super.defaultMethod();
		}

		@Override
		public String defaultFunction() {
//			return ExtendInterface.super.defaultFunction();
			return OtherInterface.super.defaultFunction();
		}

	}

}
