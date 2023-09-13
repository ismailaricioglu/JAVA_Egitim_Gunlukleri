package org.example.PKExamplesOfClass.Interface;

public interface AInterface {
    // Nested Interface in Java
    interface Interface {
        void print();

        interface NestedInterface {
            void msg();
        }
    }

    // Marker or tagged interface
    public interface Serializable {
    }

    public interface Paymentable {
        // normal method
        void cash();

        // Java 8 Default Method
        default void note() {
            System.out.println("default method");
        }
    }

}
