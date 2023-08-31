package org.example.PKExamplesOfClass.PKExamplesOfOver.Overriding.Exceptions;

import java.io.*;

public class ASubclass extends ASuperclass {
    // If the superclass method does not declare an exception
    //      If the superclass method does not declare an exception,
    //      subclass overridden method cannot declare the checked exception
    //      but it can declare unchecked exception.
    // If the superclass method declares an exception
    //      If the superclass method declares an exception,
    //      subclass overridden method can declare same,
    //      subclass exception or no exception but cannot declare parent exception.

    //void msg1 () throws IOException {System.out.println("This ise ASubclass");} // C.T.Error
    void msg2 () throws ArithmeticException {System.out.println("This ise ASubclass");}
    //void msg3() throws Exception {System.out.println("This ise ASubclass");} // C.T.Error
    void msg4() throws Exception {System.out.println("This ise ASubclass");}
    void msg5() throws ArithmeticException {System.out.println("This ise ASubclass");}
    void msg6() {System.out.println("This ise ASubclass");}
}
