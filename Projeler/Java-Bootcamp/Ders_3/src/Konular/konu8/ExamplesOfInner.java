package Konular.konu8;

public class ExamplesOfInner {

	public static void main(String[] args) {

//		Nested Inner Class
		Outer.Inner1 in = new Outer().new Inner1();
		in.show();

//		Method Local Inner Classes
		Outer x = new Outer();
		x.outerMethod1();

//		Static Nested Classes
		Outer.Inner3.display();

//		Anonymous Inner Classes
		Outer.anonymousAltSinifNesnesi.aMethod();
		Outer.anonymousAbstractSinifNesnesi.aMethod();
		Outer.anonymousArayuzUygulayiciNesnesi.aMethod();
	}
}

class Outer {

//	Nested Inner Class

	class Inner1 {
		void show() {
			System.out.println("Outer içinde Inner1 İç sınıfı show metodu çağırıldı");
		}
	}

//	Method Local Inner Classes

	void outerMethod1() {
		int x = 98;
		final int z = 98;
		System.out.println("Outer içinde outerMethod1 metodu çağırıldı");
		class Inner2 {
			void innerMethod() {
				System.out
						.println("Outer içinde outerMethod1 metodu içinde Inner2 sınıfı innerMethod metodu çağırıldı");
				System.out.println("int x = " + x);
				System.out.println("final int z = " + z);
			}
		}
		Inner2 y = new Inner2();
		y.innerMethod();
	}

//	Static Nested Classes

	private static void outerMethod2() {
		System.out.println("Outer içinde private static outerMethod2 metodu çağırıldı");
	}

	static class Inner3 {
		public static void display() {
			System.out.println("Outer içinde Inner3 sınıfı public static display metodu çağırıldı");
			outerMethod2();
		}
	}

//	Anonymous Inner Classes

//	Belirtilen türün bir alt sınıfı olarak

	public static HelperClass anonymousAltSinifNesnesi = new HelperClass() {
		void aMethod() {
			super.aMethod();
			System.out.println("Helper Class aMethod : Outer class");
		}
	};

//	Belirtilen türün bir alt sınıfı olarak

	public static HelperAbstractClass anonymousAbstractSinifNesnesi = new HelperAbstractClass() {
		void aMethod() {
			System.out.println("Helper Class aMethod : Outer class");
		}
	};

//	Belirtilen arayüzün uygulayıcısı olarak

	static Hello anonymousArayuzUygulayiciNesnesi = new Hello() {
		public void aMethod() {
			System.out.println("Helper Class aMethod : Outer class");
		}
	};
}

//	+ Anonymous Inner Classes

//	Belirtilen tür sınıfı

class HelperClass {
	void aMethod() {
		System.out.println("Helper Class aMethod : super classdan");
	}
}

//	Belirtilen tür Abstract sınıfı
abstract class HelperAbstractClass {
	abstract void aMethod();
}

//	Belirtilen arayüz

interface Hello {
	void aMethod();
}
