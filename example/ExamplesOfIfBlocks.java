package org.example;

public class ExamplesOfIfBlocks {
    // İf-else and usage patterns
    public void IfElseAndUsagePatterns() {

        // Type 1:
        if (true) {
            System.out.println("runned for if");
        } else if (true) {
            System.out.println("runned for else if");
        } else {
            System.out.println("runned for else");
        }

        // Type 2:
        if (true) {
            System.out.println("runned for if");
        } else if (true) {
            System.out.println("runned for else if");
        }

        // Type 3:
        if (true) {
            System.out.println("runned for if");
        } else {
            System.out.println("runned for else");
        }

        // Type 4:
        if (true)
            System.out.println("runned for if with single line");
    }
}
