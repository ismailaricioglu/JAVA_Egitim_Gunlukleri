package Konular.konu9;

import Konular.konu9.OuterClass.StaticNestedClass;

public class ExamplesOfStatic {
	public static void main(String[] args) {

		System.out.println("\n_static main method başladı ");

//		Variable - Değişken
		System.out.println("\n_static Variable içerikleri başladı ");

		System.out.println("aStaticInt value	: " + aStaticInt); //
		System.out.println("aStaticString value	: " + aStaticString); //

		System.out.println("_static Variable içerikleri bitti ");

//		Method - Yöntem
		System.out.println("\n_static Method içerikleri başladı ");

		aStaticMethod(aStaticInt); // 2. çağırılışı
		aStaticMethod(aStaticInt); // 3. çağırılışı

		System.out.println("_static Method  içerikleri bitti ");

//		Nested Class

		// System.out.println(OuterClass.staticOuterField);
		
		System.out.println("\n_static Nested Class içerikleri başladı \n");

		System.out.println("Inner class:");
		System.out.println("------------");
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		innerObject.accessMembers();

		System.out.println("\nStatic nested class:");
		System.out.println("--------------------");
//		Konular.konu09.OuterClass.StaticNestedClass staticNestedObject = 
//				new Konular.konu09.OuterClass.StaticNestedClass();
		// import ...
		StaticNestedClass staticNestedObject = new StaticNestedClass();
		staticNestedObject.accessMembers(outerObject);

		System.out.println("\nTop-level class:");
		System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
		topLevelObject.accessMembers(outerObject);

		System.out.println("\n_static Nested Class içerikleri başladı ");

		System.out.println("\n_static main method bitti ");
	}

//	Variable - Değişken
	static int aStaticInt = 1; // primitive variable
	static String aStaticString = "aStaticString bir non-primitive variable' dır"; // non-primitive variable

//	Method
	static void aStaticMethod(int counter) {
		aStaticString = "aStaticMethod'unda " + aStaticFunction(counter);
		System.out.println(aStaticString);
		aStaticInt++;
	}

	static String aStaticFunction(int counter) {
		return "aStaticFunction fonksiyonu kullanılarak " + aStaticInt + " defa çağırıldı ve çalıştı";
	}

//	Block
	static {
		System.out.println("_static Block kodu başladı");
		aStaticMethod(aStaticInt); // 1. çağırılışı
		System.out.println("_static Block kodu bitti");
	}

}

//Nested Class
class OuterClass {

	

	String outerField = "Üst alan";
	static String staticOuterField = "Static üst alan";

	// iç sınıf
	class InnerClass {
		void accessMembers() {
			System.out.println(outerField);
			System.out.println(staticOuterField);
		}
	}

	// statik iç içe sınıf
	static class StaticNestedClass {
		void accessMembers(OuterClass outer) {
			// Compiler error: Cannot make a static reference to the non-static
			// field outerField
//			 System.out.println(outerField); // statik olmadığı için ilgili üyeye ait olduğu sınıfın bir örneği olmadan erişilemez
			System.out.println(outer.outerField); // iç içe sınıf 'outer.outerField' kullanımı
			System.out.println(staticOuterField);
		}
	}
}

class TopLevelClass {

	void accessMembers(OuterClass outer) {
		// Compiler error: Cannot make a static reference to the non-static
		// field OuterClass.outerField
		// System.out.println(OuterClass.outerField); // statik olmadığı için ilgili üyeye ait olduğu sınıfın bir örneği olmadan erişilemez
		System.out.println(outer.outerField);
		System.out.println(OuterClass.staticOuterField);
	}
}