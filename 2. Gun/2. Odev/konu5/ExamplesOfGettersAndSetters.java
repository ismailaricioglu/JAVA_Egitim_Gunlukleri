package Konular.konu5;

public class ExamplesOfGettersAndSetters {

	// Getter - Setter

	// Genellikle erişime kapalı alan ve özelliklerin kapsüllemesinde kullanılır
	// Bu nedenle erişim belirteci (private) herkese kapalı yapılır 

	int aInt = 0; // Fields
	String aString; // Attributes

	// Getter - Değer atama/yazma metodu
	public int getaInt() {
		return aInt;
	}

	public String getaString() {
		return aString;
	}

	// Setter - Değer alma/okuma metodu
	public void setaInt(int aInt) {
		this.aInt = aInt;
	}

	public void setaString(String aString) {
		this.aString = aString;
	}

}