package org.example.PKExamplesOfBases;

public class ExamplesOfVariables {

    // Primitive Data Type
    public class PrimitiveVariables {
        boolean aBoolean;
        byte aByte;
        short aShort;
        int anInt;
        long aLong;
        float aFloat;
        double aDouble;
        char aChar;

        // Maximum
        public void MaxValue() {
            aBoolean = true;
            aByte = 127;
            aShort = 32767;
            anInt = 2147483647;
            aLong = 9223372036854775807L;
            aFloat = 92233720368547758079223372036854775807f;
            aDouble = 9223372036854775809223372036854775807d;
            aChar = 0;
        }

        // Minimum
        public void MinValue() {
            aBoolean = false;
            aByte = -128;
            aShort = -32768;
            anInt = -2147483648;
            aLong = -9223372036854775808L;
            aFloat = -92233720368547758079223372036854775807f;
            aDouble = -9223372036854775809223372036854775807d;
            aChar = 65535;
        }
    }

    // Non-Primitive Data Type
    public class NonPrimitiveVariables {
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
    }

}
