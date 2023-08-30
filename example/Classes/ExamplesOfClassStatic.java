package org.example;

public class ExamplesOfClassStatic {
    public static String aString = "static class run";

    public ExamplesOfClassStatic(String aString) {
        this.aString = aString;
    }

    public static void Run() {
        System.out.println(aString);
    }
}
