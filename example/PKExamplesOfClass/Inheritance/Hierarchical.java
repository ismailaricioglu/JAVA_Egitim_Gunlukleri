package org.example.PKExamplesOfClass.Inheritance;

public class Hierarchical extends Reusability {
    public String nameOfHierarchical = "Hierarchical Class";

    public Hierarchical() {
        // Reusability constructor
    }
    @Override
    public String toString() {
        Hierarchical o = new Hierarchical();
        return ("This [ Superclass ] class attribute name: " + o.nameOfSuperclass) + "\n" +
                ("This [ Reusability ] class attribute name: " + o.nameOfReusability) + "\n" +
                ("This [ Reusability ] class attribute name: " + o.nameOfHierarchical);
    }
}
