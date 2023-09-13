package org.example.PKExamplesOfClass.Static;

public class StaticVariables {


    byte notStaticNumber; // primitive type instance variable
    String notStaticString; // non-primitive type
    public static String staticString = "This is static variable";//static variable

    //constructor
    public StaticVariables(byte number, String name) {
        notStaticNumber = number;
        notStaticString = name;
    }

    public void run() {
        System.out.println(notStaticNumber + " " + notStaticString + " " + staticString);
    }
}
