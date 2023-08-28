package org.example;

public class ExamplesOfFor {
    // For and usage patterns
    public void ForAndUsagePatterns() {

        // Type 1:
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". time");
            System.out.println("runned for For");
        }

        // Type 2:
        for (int i = 0; i < 10; i++)
            System.out.println(i + ". time runned for For with single line");

        // Type 3:
        for (int i = 10; i > 0; i--)
            System.out.println(i + ". time runned for For with single line");

        // Type 4:
        for (int i = 0; i < 10; i += 2)
            System.out.println(i + ". time runned for For with single line");
    }

    // Foreach and usage patterns
    public void ForeachAndUsagePatterns() {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Type 1:
        for (int number:numbers) {
            System.out.println(number + ". time");
            System.out.println("runned for Foreach");
        }
    }
}
