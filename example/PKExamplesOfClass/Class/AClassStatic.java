package org.example.PKExamplesOfClass.Class;

public class AClassStatic {
    public static String aString = "static class run";

    public AClassStatic(String aString) {
        this.aString = aString;
    }

    public static void Run() {
        System.out.println(aString);
    }
}
