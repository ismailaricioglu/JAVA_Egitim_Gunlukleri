package org.example.PKExamplesOfClass.PKExamplesOfOver.Overloading;

public class OverloadingOfSubclass extends OverloadingOfSuperclass {

    public OverloadingOfSubclass() {
        System.out.println("This is Subclass constructor");
    }

    public int run(int a, int b) {
        return a + b;
    }
    //public double run(int a,int b){return a+b;} // ambiguity and C.T.Error

    // Type Promotion
    public void TypePromotionMethod(int aVariable) {
        System.out.println(
                "Type of variable is int ");
    }
    public void TypePromotionMethod(long aVariable) {
        System.out.println(
                "if the number overflows the int, type of variable is long ");
    }
    /*
    double >    float   long    int     char    short   byte
    float >     long    int     char    short   byte
    long >      int     char    short   byte
    int >       char    short   byte
    char
    short >     byte

    */

    // Note: If there are no matching type arguments in the method,
    // and each method promotes similar number of arguments,
    // there will be ambiguity.
}
