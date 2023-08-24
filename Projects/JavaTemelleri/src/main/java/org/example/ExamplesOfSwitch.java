package org.example;

public class ExamplesOfSwitch {
    // Switch and usage patterns
    public void SwitchAndUsagePatterns() {

        int number = 1;
        // Type 1:
        switch (number){
            case 0:
            case 1:
                System.out.println("Number 0 or 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
            case 3:
                System.out.println("Number 3");
                break;
            default:
                System.out.println("Number unknown or failed to match options");
        }
    }
}
