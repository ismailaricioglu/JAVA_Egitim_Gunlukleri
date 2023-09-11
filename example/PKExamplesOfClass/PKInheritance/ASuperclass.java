package org.example.PKExamplesOfClass.PKInheritance;

public class ASuperclass {
    // Base Field & Attribute
    public String nameOfSuperclass = "Superclass Class";

    public ASuperclass() {
        // Base constructor
    }

    public ASuperclass(int... numbers) {
        // Base constructor
    }

    public void OperationOfSuperclass() {
    }

    @Override
    public String toString() {
        Hierarchical o = new Hierarchical();
        return ("This [ Superclass ] class attribute name: " + o.nameOfSuperclass);
    }
}
