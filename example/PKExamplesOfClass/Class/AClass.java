package org.example.PKExamplesOfClass.Class;

public class AClass {
    // Field & Attribute
    // > default access token is public
    int number = 0;

    // > Encapsulation Getter - Setter
    private boolean isPositiveNumber;

    public boolean getIsPositiveNumber() {
        return isPositiveNumber;
    }

    public void setIsPositiveNumber(int number) {
        if (number > 0)
            this.isPositiveNumber = true;
        else
            this.isPositiveNumber = false;
    }

    // Constructor
    // > default constructor
    public AClass() {

    }

    // > Overloading constructor examples
    public AClass(int number) {
        this.number = number;
    }

    public AClass(int... numbers) {
        for (int currentNumber : numbers) {
            setIsPositiveNumber(currentNumber);
            System.out.println(currentNumber + " : " + (isPositiveNumber ? "Positive" : "Negative or 0"));
        }
    }
}
