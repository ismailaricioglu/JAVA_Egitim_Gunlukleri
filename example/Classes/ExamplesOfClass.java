package org.example;

public class ExamplesOfClass {
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
    public ExamplesOfClass() {

    }

    // > Overloading constructor examples
    public ExamplesOfClass(int number) {
        this.number = number;
    }

    public ExamplesOfClass(int... numbers) {
        for (int currentNumber : numbers) {
            setIsPositiveNumber(currentNumber);
            System.out.println(currentNumber + " : " + (isPositiveNumber ? "Positive" : "Negative or 0"));
        }
    }
}
