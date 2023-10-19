package Konular.konu5;

public class ExamplesOfPolymorphism {
	public static void main(String[] args) {

//		Çalışma Zamanı Polimorfizmi Örneği

//		Object val;
//		BaseInterface val;
//		BaseAbstract val;		
		BaseClass val;

		val = new ExtendClass(); // upcasting
//		Çalışma zamanı polimorfizm'de Veri üyeleri elde edilemez.
//		System.out.println(val.dataMemberBI); // BaseInterface'den gelir
//		System.out.println(val.dataMember); // BaseClass'dan gelir		
		val.methodBI(); // overrider ile oluştu
		System.out.println("Extend Class fonksiyonu : " + val.functionBI()); // overrider ile oluştu

		val = new ECOne(); // upcasting
//		Çalışma zamanı polimorfizm'de Veri üyeleri elde edilemez.
//		System.out.println(val.dataMemberBI); // BaseInterface'den gelir
//		System.out.println(val.dataMember); // BaseClass'dan gelir
		val.methodBI(); // overrider ile oluştu
		System.out.println("Extend Class One fonksiyonu : " + val.functionBI()); // overrider ile oluştu

		val = new ECTwo(); // upcasting
//		Çalışma zamanı polimorfizm'de Veri üyeleri elde edilemez.
//		System.out.println(val.dataMemberBI); // BaseInterface'den gelir
//		System.out.println(val.dataMember); // BaseClass'dan gelir
		val.methodBI(); // overrider ile oluştu
		System.out.println("Extend Class Two fonksiyonu : " + val.functionBI()); // overrider ile oluştu

	}

	interface BaseInterface {

		float dataMemberBI = 0f;

		void methodBI();

		float functionBI();
	}

	static abstract class BaseAbstract implements BaseInterface {
		public float dataMember = dataMemberBI;

		abstract void method();

		abstract float function();
	}

	static class BaseClass extends BaseAbstract {

		float dataMember = 0.1f;

		void method() {
			System.out.println("BaseClass'da method çalıştı");
		}

		float function() {
			return dataMember;
		}

		@Override
		public void methodBI() {
			method();

		}

		@Override
		public float functionBI() {
			return function();
		}
	}

	static class ExtendClass extends BaseClass {

//		Data Member - veri üyesi
		float dataMember = 0.01f;

//		Method - metot
		void method() {
			System.out.println("ExtendClass'da method çalıştı");
		}

//		Function - fonksiyon
		float function() {
			return dataMember;
		}

	}

	static class ECOne extends BaseClass {

		float dataMember = 0.001f;

		void method() {
			System.out.println("ECOne'da method çalıştı");
		}

		float function() {
			return dataMember;
		}
	}

	static class ECTwo extends BaseClass {

		float dataMember = 0.0001f;

		void method() {
			System.out.println("ECTwo'da method çalıştı");
		}

		float function() {
			return dataMember;
		}
	}
}
