package org.example;

public class ExamplesOfInheritanceHierarchical extends ExamplesOfInheritanceReusability {
    public String nameOfHierarchical = "Hierarchical Class";

    public ExamplesOfInheritanceHierarchical() {
        // Reusability constructor
    }
    @Override
    public String toString() {
        ExamplesOfInheritanceHierarchical o = new ExamplesOfInheritanceHierarchical();
        return ("This [ Superclass ] class attribute name: " + o.nameOfSuperclass) + "\n" +
                ("This [ Reusability ] class attribute name: " + o.nameOfReusability) + "\n" +
                ("This [ Reusability ] class attribute name: " + o.nameOfHierarchical);
    }
}
