package org.example.PKExamplesOfClass.Static;

public class StaticMethods {
    byte notStaticNumber; // primitive type instance variable
    String notStaticString; // non-primitive type
    public static String staticString ="This is static variable";//static variable
    //static method to change the value of static variable
    public static void change(){
        staticString = "this modified content in class, the same data can be accessed from anywhere";
    }
    //constructor to initialize the variable
    public StaticMethods(byte number, String name){
        notStaticNumber = number;
        notStaticString = name;
    }

    public void run(){System.out.println(notStaticNumber+" "+notStaticString+" "+staticString);}
}