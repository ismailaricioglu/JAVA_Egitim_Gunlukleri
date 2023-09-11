package org.example.PKExamplesOfClass.PKInheritance;

public class Reusability extends ASuperclass {
    public String nameOfReusability = "Reusability Class";

    public Reusability() {
        // Reusability constructor
    }

    @Override
    public String toString() {
        Reusability o = new Reusability();
        return ("This [ Superclass ] class attribute name: " + o.nameOfSuperclass) + "\n" +
                ("This [ Reusability ] class attribute name: " + o.nameOfReusability);
    }
}
