package Konular.konu2;

public class ExamplesOfAbstracts {

	public static void main(String[] args) {

		System.out.println("\n* constructor *\n");
		ExtendClass extendClass = new ExtendClass();

		System.out.println("\n* field & attribute *\n");
		System.out.println(extendClass.aString);
		System.out.println(extendClass.aPrivateString);
		System.out.println(extendClass.aProtectedString);
		System.out.println(extendClass.aPublicString);

		System.out.println("\n* getter- setter *\n");

		extendClass.setaString("setaString");
		extendClass.setaPrivateString("setaPrivateString");
		extendClass.setaProtectedString("setaProtectedString");
		extendClass.setaPublicString("setaPublicString");

		System.out.println(extendClass.getaString());
		System.out.println(extendClass.getaPrivateString());
		System.out.println(extendClass.getaProtectedString());
		System.out.println(extendClass.getaPublicString());

		System.out.println("\n* method & function *\n");
		extendClass.bodyNonAbstractMethod();
		System.out.println(extendClass.bodyNonAbstractFunction(0));

		System.out.println("---");
		extendClass.unbodyAbstractMethod();
		System.out.println(extendClass.unbodyAbstractFunction(0));

		System.out.println("---");
		extendClass.NonOverrideMethod();
		System.out.println(extendClass.NonOverrideFunction(0));

	}

	public static abstract class AbstractClass {

		// field & attribute

		String aVariable = "AbstractClass String aVariable değişkeni";

		String aString = "AbstractClass String aString değişkeni";
		private String aPrivateString = "AbstractClass private String aPrivateString değişkeni";
		protected String aProtectedString = "AbstractClass protected String aProtectedString değişkeni";
		public String aPublicString = "AbstractClass public String aPublicString değişkeni";

		// getter- setter

		public String getaString() {
			return "AbstractClass sınıfından Get Metodu : " + aString;
		}

		public String getaPrivateString() {
			return "AbstractClass sınıfından Get Metodu : " + aPrivateString;
		}

		public String getaProtectedString() {
			return "AbstractClass sınıfından Get Metodu : " + aProtectedString;
		}

		public String getaPublicString() {
			return "AbstractClass sınıfından Get Metodu : " + aPublicString;
		}

		public void setaString(String aString) {
			this.aString = aString;
		}

		public void setaPrivateString(String aPrivateString) {
			this.aPrivateString = aPrivateString;
		}

		public void setaProtectedString(String aProtectedString) {
			this.aProtectedString = aProtectedString;
		}

		public void setaPublicString(String aPublicString) {
			this.aPublicString = aPublicString;
		}

		// constructor

		public AbstractClass() {
			super();
			System.out.println("AbstractClass yapılandırıcı metodu çağırıldı");
		}

		public AbstractClass(String aString, String aPrivateString, String aProtectedString, String aPublicString) {
			super();
			this.aString = aString;
			this.aPrivateString = aPrivateString;
			this.aProtectedString = aProtectedString;
			this.aPublicString = aPublicString;
			System.out.println("AbstractClass yapılandırıcı metodu çağırıldı");
		}

		// method & function

		// unbody - gövdesiz

		abstract void unbodyAbstractMethod();

		abstract int unbodyAbstractFunction(int val);

		// body - gövedeli

		void bodyNonAbstractMethod() {
			System.out.println("Abstract sınıfın Gövdesi Dolu metodu çağırıldı");
		};

		int bodyNonAbstractFunction(int val) {
			System.out.println("Abstract sınıfın Gövdesi Dolu fonksiyonu çağırıldı & çalıştırıldı");
			return val;
		};

		final void NonOverrideMethod() {
			System.out.println("Abstract sınıfın Geçersiz Kılınamaz (nonoverride) ve Gövdesi Dolu metodu çağırıldı");
		};

		final int NonOverrideFunction(int val) {
			System.out.println(
					"Abstract sınıfın Geçersiz Kılınamaz (nonoverride) ve Gövdesi Dolu fonksiyonu çağırıldı & çalıştırıldı");
			return val;
		};

	}

	public static class ExtendClass extends AbstractClass {

		// field & attribute

		String aString = "Extend sınıfta Abstract sınıfın Override edilmiş String aString değişkeni";
		private String aPrivateString = "Extend sınıfta Abstract sınıfın Override edilmiş private String aPrivateString değişkeni";
//		protected String aProtectedString = "ExtendClass protected String aProtectedString";
//		public String aPublicString = "ExtendClass public String aPublicString";

		String aVariable = "Extend sınıfta Abstract sınıfın Override edilmiş String aVariable değişkeni";

		// getter- setter

		@Override
		public String getaString() {

//			return "ExtendClass sınıfından Get Metodu : " + super.getaString();
			return "ExtendClass sınıfından Get Metodu : " + aString;
		}

		@Override
		public String getaPrivateString() {
			return "ExtendClass sınıfından Get Metodu : " + super.getaPrivateString();
		}

		@Override
		public String getaProtectedString() {
			return "ExtendClass sınıfından Get Metodu : " + super.getaProtectedString();
		}

		@Override
		public String getaPublicString() {
			return "ExtendClass sınıfından Get Metodu : " + super.getaPublicString();
		}

		@Override
		public void setaString(String aString) {

//			super.setaString(aString);
			this.aString = aString;
		}

		@Override
		public void setaPrivateString(String aPrivateString) {

//			super.setaPrivateString(aPrivateString);
			this.aPrivateString = aPrivateString;
		}

		@Override
		public void setaProtectedString(String aProtectedString) {

//			super.setaProtectedString(aProtectedString);
			this.aProtectedString = aProtectedString;
		}

		@Override
		public void setaPublicString(String aPublicString) {

//			super.setaPublicString(aPublicString);
			this.aPublicString = aPublicString;
		}

		// constructor

		public ExtendClass() {
			super();
		}

		public ExtendClass(String aString, String aPrivateString, String aProtectedString, String aPublicString) {
			super(aString, aPrivateString, aProtectedString, aPublicString);
		}

		// method & function

		@Override
		void unbodyAbstractMethod() {
			System.out.println("Extend sınıfta Gövdesi doldurulmuş metodu çağırıldı");
		}

		@Override
		int unbodyAbstractFunction(int val) {
			System.out.println("Extend sınıfta Gövdesi doldurulmuş fonksiyonu çağırıldı & çalıştırıldı");
			return 0;
		}

		@Override
		void bodyNonAbstractMethod() {
			System.out.println("Extend sınıfta Abstract sınıfın Override edilmiş ve Gövdesi Dolu metodu çağırıldı");
		};

		@Override
		int bodyNonAbstractFunction(int val) {
			System.out.println(
					"Extend sınıfta Abstract sınıfın Override edilmiş ve Gövdesi Dolu fonksiyonu çağırıldı & çalıştırıldı");
			return val;
		};

//		Geçersiz kılınamaz metot & fonksiyon
//		
//		@Override
//		void NonOverrideMethod() {
//			System.out.println("...");
//		};
//		
//		@Override
//		int NonOverrideFunction() {
//			System.out.println("...");
//		};

	}

}
