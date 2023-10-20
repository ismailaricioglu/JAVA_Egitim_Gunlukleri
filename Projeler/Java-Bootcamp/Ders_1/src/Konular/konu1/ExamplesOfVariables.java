package Konular.konu1;

public class ExamplesOfVariables {

	public static void main(String[] args) {

		PrimitiveDataTypeMaxValue();
		System.out.println("\n_Primitive Data Type MaxValue");
		System.out.println("aBoolean	:	" + aBoolean);
		System.out.println("aByte		:	" + (Byte.MAX_VALUE + 0));
		System.out.println("aShort		:	" + (Short.MAX_VALUE + 0));
		System.out.println("anInt		:	" + (Integer.MAX_VALUE + 0));
		System.out.println("aLong		:	" + (Long.MAX_VALUE + 0));
		System.out.println("aFloat		:	" + (Float.MAX_VALUE + 0));
		System.out.println("aDouble		:	" + (Double.MAX_VALUE + 0));
		System.out.println("aChar		:	" + (Character.MAX_VALUE + 0));

		PrimitiveDataTypeMinValue();
		System.out.println("\n_Primitive Data Type MinValue");
		System.out.println("aBoolean	:	" + aBoolean);
		System.out.println("aByte		:	" + (Byte.MIN_VALUE + 0));
		System.out.println("aShort		:	" + (Short.MIN_VALUE + 0));
		System.out.println("anInt		:	" + (Integer.MIN_VALUE + 0));
		System.out.println("aLong		:	" + (Long.MIN_VALUE + 0));
		System.out.println("aFloat		:	" + (Float.MIN_VALUE + 0));
		System.out.println("aDouble		:	" + (Double.MIN_VALUE + 0));
		System.out.println("aChar		:	" + (Character.MIN_VALUE + 0));

		NonPrimitiveDataTypeMaxValue();
		System.out.println("\n_Non Primitive Data Type MaxValue");
		System.out.println("aString		:	" + aString);

		NonPrimitiveDataTypeMinValue();
		System.out.println("\n_Non Primitive Data Type MinValue");
		System.out.println("aString		:	" + aString);

	}

	// İlkel Veri Tipi - Primitive Data Type
	static boolean aBoolean;
	static byte aByte;
	static short aShort;
	static int anInt;
	static long aLong;
	static float aFloat;
	static double aDouble;
	static char aChar;

	// En Büyük - Maximum
	public static void PrimitiveDataTypeMaxValue() {
		aBoolean = true;
		aByte = 127;
		aShort = 32767;
		anInt = 2147483647;
		aLong = 9223372036854775807L;
		aFloat = 3.4028235E38f;
		aDouble = 1.7976931348623157E308d;
		aChar = 65535;
	}

	// En Küçük - Minimum
	public static void PrimitiveDataTypeMinValue() {
		aBoolean = false;
		aByte = -128;
		aShort = -32768;
		anInt = -2147483648;
		aLong = -9223372036854775808L;
		aFloat = 1.4E-45f;
		aDouble = 4.9E-324d;
		aChar = 0;
	}

	// İlkel Olmayan Veri Tipi - Non-Primitive Data Type
	static String aString;

	// En Büyük - Maximum
	public static void NonPrimitiveDataTypeMaxValue() {
		aString = "Java'da String'in maksimum uzunluğu 2.147.483.647 karakterdir";
	}

	// En Küçük - Minimum
	public static void NonPrimitiveDataTypeMinValue() {
		aString = "Java'da String'in minimum uzunluğu 0 karakterdir, eğer varsayılan bir ilk değer verilmemiş ise null değer döner";
	}

}