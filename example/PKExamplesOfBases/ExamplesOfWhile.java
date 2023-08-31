package org.example.PKExamplesOfBases;

public class ExamplesOfWhile {
    // While and usage patterns
    public void WhileAndUsagePatterns() {

        int number = 0;
        // Type 1:
        while (number < 10) {
            number++;
            if (number ==2)
                //break; // does not continue the cycle
                continue; // returns to the beginning of the loop
            System.out.println("Number is " + number);
        }

        // Type 2:
        while (number > 0)
            System.out.println("Number is " + (number--) + " with single line");
    }

    // Do-While and usage patterns
    public void DoWhileAndUsagePatterns() {

        int number = 0;
        // Type 1: Run at least once
        do {
            number++;
            System.out.println("Number is " + number);
        }while (number < 10);

        // Type 2: Run at least once and Not with single line
        do {
            System.out.println("Number is " + (number--) + " with single line");
        }while (number > 0);
    }
}
