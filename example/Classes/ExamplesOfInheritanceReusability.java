package org.example;

public class ExamplesOfInheritanceReusability extends ExamplesOfInheritanceSuperclass {
    public String nameOfReusability = "Reusability Class";

    public ExamplesOfInheritanceReusability() {
        // Reusability constructor
    }

    @Override
    public String toString() {
        ExamplesOfInheritanceReusability o = new ExamplesOfInheritanceReusability();
        return ("This [ Superclass ] class attribute name: " + o.nameOfSuperclass) + "\n" +
                ("This [ Reusability ] class attribute name: " + o.nameOfReusability);
    }
}
