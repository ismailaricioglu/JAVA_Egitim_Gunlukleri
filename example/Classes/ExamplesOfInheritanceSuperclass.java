package org.example;

public class ExamplesOfInheritanceSuperclass {
    // Base Field & Attribute
    public String nameOfSuperclass = "Superclass Class";

    public ExamplesOfInheritanceSuperclass() {
        // Base constructor
    }

    public ExamplesOfInheritanceSuperclass(int... numbers) {
        // Base constructor
    }

    public void OperationOfSuperclass() {
    }

    @Override
    public String toString() {
        ExamplesOfInheritanceHierarchical o = new ExamplesOfInheritanceHierarchical();
        return ("This [ Superclass ] class attribute name: " + o.nameOfSuperclass);
    }
}
