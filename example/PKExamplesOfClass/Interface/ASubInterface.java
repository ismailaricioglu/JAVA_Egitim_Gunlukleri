package org.example.PKExamplesOfClass.Interface;

public interface ASubInterface {
    interface Defer extends AInterface.Paymentable {
        // Java 8 Static Method
        static int deferred(int x) {
            return x * x * x;
        }
    }
}