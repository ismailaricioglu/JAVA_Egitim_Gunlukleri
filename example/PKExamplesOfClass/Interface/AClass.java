package org.example.PKExamplesOfClass.Interface;

// Multiple inheritance of Interface
public class AClass implements AInterface.Paymentable, ASubInterface.Defer {
    public void cash() {
        System.out.println("Tis is normal method");

    }
}
