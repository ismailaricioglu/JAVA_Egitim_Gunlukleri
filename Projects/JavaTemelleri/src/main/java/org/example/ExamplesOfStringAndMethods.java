package org.example;

import java.time.LocalDate;
import java.util.Calendar;

public class ExamplesOfStringAndMethods {

    // String Length

    String aString;

    // Maximum
    public void MaxValue() {
        aString = "Therefore, the maximum length of String in Java is 0 to 2147483647";
        System.out.println(aString);
    }

    // Minimum
    public void MinValue() {
        aString = "0";
        System.out.println(aString);
    }


    //
    public void StringMethods() {
        String aString = "Example sentence for string";


        // charAt() - char
        System.out.println(aString.charAt(0) + " charAt(0) ile 1. karakteri döner");
        // codePointAt() - int
        System.out.println(aString.codePointAt(0) + " codePointAt(0) ile unicode döner");
        // codePointBefore() - int
        System.out.println(aString.codePointBefore(1) + " codePointBefore(1) ile 1. karakterin öncesinde ki karakteri döner");
        // codePointCount() - int
        System.out.println(aString.codePointCount(0, 2) + " codePointCount(0, 2) ile 1. ile 3. arası karakter sayısını döner");
        // compareTo() - int
        System.out.println(aString.compareTo("Example sentence for string") + " iki string değerinin karşılaştırması aynı:0, eksik: +fark, fazla: -fark");
        // compareToIgnoreCase() - int
        System.out.println(aString.compareToIgnoreCase("Example sentence for string") + " Büyük küçük farksız iki string değerinin karşılaştırması aynı:0, eksik: +fark, fazla: -fark");
        // concat() - String
        System.out.println(aString.concat(" concat(bu stringi ekleyerek yeni bir string yaratır)"));
        // contains() - boolean
        System.out.println(aString.contains("string") + " contains(\"string\") ile içeriip içermedğini döner");
        // contentEquals() - boolean
        System.out.println(aString.contentEquals("Example sentence for string") + " contentEquals(\"Example sentence for string\") ile belirtilen CharSequence veya StringBuffer içeriip içermedğini döner");
        // copyValueOf() - String
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(aString.copyValueOf(myStr1, 0, 5) + " aString.copyValueOf(myStr1, 0, 5) ile myStr1 charsetinden 0-5 arası indexli değerleri döner");
        System.out.println(aString);
        // endsWith() - boolean
        System.out.println(aString.endsWith("string") + " endsWith(\"string\") ile sonu string ile bitip bitmediğini döner");
        // equals() - boolean
        System.out.println(aString.equals("string") + " equals(\"string\") İki diziyi karşılaştırır. Dizeler eşitse true, eşit değilse false değerini döner");
        // equalsIgnoreCase() - boolean
        System.out.println(aString.equalsIgnoreCase("string") + " equalsIgnoreCase(\"string\") büyük küç ayırmadan iki diziyi karşılaştırır. Dizeler eşitse true, eşit değilse false değerini döner");
        // format() - String
        // * * * ayrıca bakalım
        //System.out.println(aString.format());
        // getBytes() - byte[]
        System.out.println(aString.getBytes() + " getBytes() ile byte cinsinden değerleri döner");
        // getChars() - void
        char[] ch = new char[10];
        try {
            aString.getChars(6, 16, ch, 0);
            System.out.print(ch);
            System.out.println(" aString.getChars(6, 16, ch, 0) ile charset döner");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        // hashCode() - int
        System.out.println(aString.hashCode() + " stringin karma kodunu döner");
        // indexOf() - int
        System.out.println(aString.indexOf("en") + " indexOf(\"string\") ile kaçıncı indexten başladığını döner");
        // intern() - String
        System.out.println(aString.intern() + " intern() ile String sabit havuzuna yerleştirir ve nesnenin referansını döner");
        // isEmpty() - boolean
        System.out.println(aString.isEmpty() + " isEmpty() ile boş olup olmadığını döner");
        // lastIndexOf() - int
        System.out.println(aString.lastIndexOf("en") + " lastIndexOf(\"string\") ile sondan başlayarak kaçıncı indexten başladığını döner");
        // length() - int
        System.out.println(aString.length() + " length() ile boyutunu döner");
        // matches() - boolean
        System.out.println(aString.matches("Example sentence for string") + " matches(\"Example sentence for string\") ile Bir dizede normal ifadeyle eşleşme arar ve eşleşmeleri döndürür");
        // offsetByCodePoints() - int
        System.out.println(aString.offsetByCodePoints(2, 4) + " offsetByCodePoints(2, 4) ile başlama ve ilerleme indexi kadar ilerlendiğinde varsa bir karakter indexini döner");
        // regionMatches() - boolean
        System.out.println(aString.regionMatches(21, "string", 0, 6) + " regionMatches(21,\"string\",0,6) ile başlama indexi, aranacak string, aranacak string başlama indexi, aranacak karakter sayısını döner");
        // replace() - String
        System.out.println(aString.replace("en", "EN") + " replace(\"en\",\"EN\") ile yenilenecek tüm en ve değiştirilecek EN kullanarak yeni bir string döner ");
        // replaceFirst() - String
        System.out.println(aString.replaceFirst("en", "EN") + " replaceFirst(\"en\",\"EN\") ile yenilenecek ilk en ve değiştirilecek EN kullanarak yeni bir string döner ");
        // replaceAll() - String
        System.out.println(aString.replaceAll("en", "EN") + " replace(\"en\",\"EN\") ile yenilenecek tüm en ve değiştirilecek EN kullanarak yeni bir string döner ");
        // split() - String[]
        System.out.println(aString.split(" ").length + " split(\" \") ile belirtilen string elemanının baz alarak böler");
        // startsWith() - boolean
        System.out.println(aString.startsWith("Exa") + " startsWith(\"Exa\") ile string başlama değeri olup olmadığını dömer");
        // subSequence() - CharSequence
        System.out.println(aString.subSequence(0, 4) + " subSequence(0,4) ile başlama ve adet indexi ile yeni  CharSequence yaratır");
        // substring() - String
        System.out.println(aString.substring(0, 4) + " substring(0,4) ile başlama ve adet indexi ile yeni String yaratır");
        // toCharArray() - char[]
        System.out.println(aString.toCharArray() + " toCharArray() ile yeni char[] yaratır");
        // toLowerCase() - String
        System.out.println(aString.toLowerCase() + " toLowerCase() ile tümünü küçük harf ile döner");
        // toString() - String
        System.out.println(aString.toString() + " toString() ile String değerini döner");
        // toUpperCase() - String
        System.out.println(aString.toUpperCase() + " toLowerCase() ile tümünü büyük harf ile döner");
        // trim() - String
        aString = " Example sentence for string ";
        System.out.println(aString.trim() + " trim() ile baştan ve sondan boşlukları kaldırır");
        // valueOf() - String
        aString += String.valueOf(1000 + 1);
        System.out.println(aString.toString() + " String.valueOf(1000 + 1) ile değeri String tipine çevirir");
    }
    public void StringByFormatMethods(){
        // format() - String
        // String formatting examples
        String aString;
        aString = "String formatting examples";
// %a	kayan nokta (BigDecimal hariç) *|* Kayan nokta sayısının Hex çıktısını döndürür.
        System.out.println(String.format("%a", 10.01f));
// %b	Her hangi bir tür *|* "true" if non-null, "false" if null
        System.out.println(String.format("%b", "true if not null"));
// %c	character *|* Unicode character
        System.out.println(String.format("%c", 65));
// %d	integer (incl. byte, short, int, long, bigint) *|* Decimal Integer
        System.out.println(String.format("%d", (byte) 0101));
        System.out.println(String.format("%d", 102));
        System.out.println( String.format("|%10d|", 102));  // Specifying length of integer
        System.out.println( String.format("|%-10d|", 102)); // Left-justifying within the specified width
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
    }
}
