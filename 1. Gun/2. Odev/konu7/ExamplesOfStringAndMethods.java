package Konular.konu7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.List;

public class ExamplesOfStringAndMethods {

	public static void main(String[] args) {

		MaxValue();
		MinValue();

		StringMethods();
		StringByFormatMethods(); 

	}

	// İlkel Olmayan Veri Tipleri - Non-Primitive Data Type
	// String - Katar
	static String aString;

	// String Length
	// Maximum
	public static void MaxValue() {
		aString = "Java'da String'in maksimum uzunluğu 2.147.483.647 karakterdir";
		System.out.println("\n_Maximum değeri ");
		System.out.println(aString);
	}

	// Minimum
	public static void MinValue() {
		aString = "Java'da String'in minimum uzunluğu 0 karakterdir, eğer varsayılan bir ilk değer verilmemiş ise null değer döner";
		System.out.println("\n_Maximum değeri ");
		System.out.println(aString);
	}

	// System.out.println();
	public static class Ekran {

		static Formatter fmt = new Formatter();
		static List<Formatter> aStringLine = new ArrayList<>();

		public static void Add(String aString1, String aString2, String aString3, String aString4) {
			fmt = new Formatter();
			fmt.format("%25s %15s %22s  %10s\n", aString1, aString2, aString3, aString4);
			aStringLine.add(fmt);
		}

		public static void PrintOfValue() {
			System.out.println("");
			for (Formatter fmt : aStringLine) {
				// System.out.format("%32s%100s", string1, int1, string2);
				System.out.print(fmt);
			}
		}

		public static void Clear() {
			aStringLine.clear();
		}
	}

	// Metotlar - Methods
	public static void StringMethods() {

		String aString = "Örnek cümle.";
		Ekran.Add("", "", "Bilgi",
				"\'" + aString + "\'" + " string değeri üzerinden aşağıdaki metotlar ele alınmıştır\n");
		Ekran.Add("METHODS/FONKSION", "RESULT TYPE", "RESULT VALUE", "DECLARATIONS");
		Ekran.Add("-------------------------", "---------------", "----------------------",
				"------------------------------------------------------------");

		Ekran.Add("charAt()", "char", aString.charAt(0) + "", "1. karakteri döner");
		Ekran.Add("codePointAt()", "int", aString.codePointAt(0) + "", "indexi belirli karakterin unicode'nu döner");
		Ekran.Add("codePointBefore()", "int", aString.codePointBefore(1) + "",
				"index 1'in öceki indexinin karakterin unicode'nu döner");
		Ekran.Add("codePointCount()", "int", aString.codePointCount(1, 3) + "",
				"index 1'in ile 3. arası karakter sayısını döner");
		Ekran.Add("compareTo()", "int", aString.compareTo("Örnek cümle...") + "",
				"Küçük Büyük duyarlı, iki değerin karşılaştırması; aynı:0, eksik: +fark, fazla: -fark");
		Ekran.Add("compareToIgnoreCase()", "int", aString.compareToIgnoreCase("Örnek cümle.") + "",
				"Küçük Büyük duyarsız, iki değerin karşılaştırması aynı:0, eksik: +fark, fazla: -fark");
		Ekran.Add("concat()", "String", aString.concat("ek string") + "",
				"bu stringe ek ekleyerek yeni bir string yaratır");
		Ekran.Add("contains()", "boolean", aString.contains("Örnek") + "",
				"Küçük Büyük duyarlı, içerisinde değer arar, varsa:true, yoksa:false döner");
		Ekran.Add("contentEquals()", "boolean", aString.contentEquals("Örnek cümle.") + "",
				"Küçük Büyük duyarlı, CharSequence veya StringBuffer tam eşleşme, varsa:true, yoksa:false döner");
		char[] aCharArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		Ekran.Add("copyValueOf()", "String", String.copyValueOf(aCharArray, 0, 5) + "",
				"charsetinden başalama-bitirme indexleri arası değerleri string döner");
		// Ekran.Add("", aString);
		Ekran.Add("endsWith()", "boolean", aString.endsWith(".") + "",
				"içeriğin sonu ilgili değer ile bitiyorsa:true, değilse:false döner");
		Ekran.Add("equals()", "boolean", aString.equals("örnek cümle.") + "",
				"Küçük Büyük duyarlı, iki diziyi karşılaştırır, dizeler eşitse:true, değilse:false döner");
		Ekran.Add("equalsIgnoreCase()", "boolean", aString.equalsIgnoreCase("örnek cümle.") + "",
				"Küçük Büyük duyarsız, iki diziyi karşılaştırır, dizeler eşitse:true, değilse:false döner");
		Ekran.Add("getBytes()", "byte[]", aString.getBytes() + "", "byte cinsinden değerleri döner");
		char[] ch = new char[5];
		try {
			aString.getChars(1, 6, ch, 0);
			Ekran.Add("getChars()", "void", ch.toString() + "", "bir char[] içerisine charset döner");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		Ekran.Add("hashCode()", "int", aString.hashCode() + "", "içeriğin karma kodunu döner");
		Ekran.Add("indexOf()", "int", aString.indexOf(".") + "",
				"değerin içerikte kaçıncı indexten başladığını yoksa:-1 döner");
		Ekran.Add("intern()", "String", aString.intern() + "",
				"String sabit havuzuna yerleştirir ve nesnenin referansının içerdiği değeri döner");
		Ekran.Add("isEmpty()", "boolean", aString.isEmpty() + "", "içerik boşsa:true, değilse:false döner");
		Ekran.Add("lastIndexOf()", "int", aString.lastIndexOf("e.") + "",
				"sondan başlayarak arar, kaçıncı indexten başladığını, yoksa:-1 döner");
		Ekran.Add("length()", "int", aString.length() + "", "null değil ise boyutunu döner");
		Ekran.Add("matches()", "boolean", aString.matches("Örnek cümle.") + "",
				"Küçük Büyük duyarlı, bir dizede normal ifadeyle eşleşme arar, varsa:true, yoksa:false döner");
		Ekran.Add("offsetByCodePoints()", "int", aString.offsetByCodePoints(2, 4) + "",
				"başlama ve ilerleme indexi kadar ilerlendiğinde varsa bir karakter indexini, yoksa:hata döner");
		Ekran.Add("regionMatches()", "boolean", aString.regionMatches(0, "örnek", 0, 4) + "",
				"Küçük Büyük duyarlı, başlama indexi, aranacak değer, aranacak değer başlama indexi, aranacak karakter sayısını döner");
		Ekran.Add("replace()", "String", aString.replace("e", "E") + "",
				"yenilenecek tüm değerleri ve değiştirilecek değeri kullanarak yeni bir string döner ");
		Ekran.Add("replaceFirst()", "String", aString.replaceFirst("e", "E") + "",
				"yenilenecek ilk değeri ve değiştirilecek değeri kullanarak yeni bir string döner ");
		Ekran.Add("replaceAll()", "String", aString.replaceAll("e", "E") + "",
				"yenilenecek tüm değerleri ve değiştirilecek değeri kullanarak yeni bir string döner");
		Ekran.Add("split()", "String[]", aString.split(" ").length + "",
				"belirtilen değer elemanını baz alarak bölüm sayısı döner");
		Ekran.Add("startsWith()", "boolean", aString.startsWith("Örn") + "",
				"Küçük Büyük duyarlı, değer başlama değeri eşleşirse:true, değilse:false döner");
		Ekran.Add("subSequence()", "CharSequence", aString.subSequence(0, 4) + "",
				"başlama ve adet indexi ile yeni  CharSequence yaratır");
		Ekran.Add("substring()", "String", aString.substring(0, 4) + "",
				"başlama ve adet indexi ile yeni String yaratır");
		Ekran.Add("toCharArray()", "char[]", aString.toCharArray().toString() + "", "yeni char[] yaratır");
		Ekran.Add("toLowerCase()", "String", aString.toLowerCase() + "", "tümünü küçük harf ile döner");
		Ekran.Add("toString()", "String", aString.toString() + "", "String değerini döner");
		Ekran.Add("toUpperCase()", "String", aString.toUpperCase() + "", "tümünü büyük harf ile döner");
		aString = "   Örnek cümle. ";
		Ekran.Add("trim()", "String", aString.trim() + "", "baştan ve sondan tüm boşlukları kaldırır");
		aString += String.valueOf(1000 + 1);
		Ekran.Add("valueOf()", "String", aString.toString() + "", "değeri String tipine çevirir");

		Ekran.PrintOfValue();
		Ekran.Clear();
	}

	// Formatlama Metotları - Format Methods
	public static void StringByFormatMethods() {
		
		System.out.println("\n_Formatlama Örnekleri\n");

// %a	kayan nokta (BigDecimal hariç) *|* Kayan nokta sayısının Hex çıktısını döndürür.
		System.out.println(String.format("%a", 10.01f));
// %b	Her hangi bir tür *|* "true" if non-null, "false" if null
		System.out.println(String.format("%b", "true if not null"));
// %c	character *|* Unicode character
		System.out.println(String.format("%c", 65));
// %d	integer (incl. byte, short, int, long, bigint) *|* Decimal Integer
		System.out.println(String.format("%d", (byte) 0101));
		System.out.println(String.format("%d", 102));
		System.out.println(String.format("|%10d|", 102)); // Specifying length of integer
		System.out.println(String.format("|%-10d|", 102)); // Left-justifying within the specified width
		System.out.println(String.format("|% d|", 102));
		System.out.println(String.format("|%010d|", 102)); // Filling with zeroes
// %e	floating point *|* bilimsel gösterimde ondalık sayı
		System.out.println(String.format("%e", 10.1f));
// %f	floating point *|* ondalık sayı
		System.out.println(String.format("%f", 10.1f));
// %g	floating point *|* ondalık sayı, muhtemelen kesinliğe ve değere bağlı olarak bilimsel gösterimde.
		System.out.println(String.format("%g", 10.1f));
// %h	Her hangi bir tür *|* Hex HashCode() yönteminden gelen değer dizesi.
		System.out.println(String.format("%h", 10));
// %n	hiçbiri *|* Platforma özel hat ayırıcı.
		System.out.println("hat başı");
		System.out.print(String.format("%n"));
		System.out.println("hat sonu");
// %o	integer (incl. byte, short, int, long, bigint) *|* Sekizli sayı
		System.out.println(String.format("%o", 8));
// %s	Her hangi bir tür *|* String value
		System.out.println(String.format("%s", 10.1d + 1));
// %t	Date/Time (incl. long, Calendar, Date and TemporalAccessor) *|* %t Tarih/Saat dönüşümlerinin önekidir. Bundan sonra daha fazla biçimlendirme bayrağına ihtiyaç vardır. Aşağıdaki Tarih/Saat dönüşümüne bakın.
		// T: time
		System.out.println(String.format("%tT", Calendar.getInstance()));
		// A: Full name of the day of the week
		System.out.println(String.format("%tA", LocalDate.now()));
		// a: Short name of the day of the week
		System.out.println(String.format("%ta", LocalDate.now()));
		// B: Full name of the month
		System.out.println(String.format("%tB", LocalDate.now()));
		// b: Short name of the month
		System.out.println(String.format("%tb", LocalDate.now()));
		// C: Last two digits of the year, starting from 00 to 99
		System.out.println(String.format("%tC", LocalDate.now()));
		// D: Date formatted as “%tm/%td/%ty”, like “07/15/19”
		System.out.println(String.format("%tD", LocalDate.now()));
// %x	integer (incl. byte, short, int, long, bigint) *|* Onaltılık sayı
		System.out.println(String.format("%x", 15));
		
		System.out.println("\nDaha fazlası için https://www.javatpoint.com/java-string-format");
	}

}
