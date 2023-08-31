package org.example;

import org.example.PKExamplesOfClass.PKExamplesOfOver.Overriding.*;
import org.example.PKExamplesOfClass.PKExamplesOfOver.Overloading.*;
import org.example.PKExamplesOfClass.PKExamplesOfOver.OverloadingAndOverriding.*;

public class Main {
    public static void main(String[] args) {
        // Overriding
        /*
        OverridingOfSubclass aOverriding = new OverridingOfSubclass(); // creating object
        aOverriding.run();
        // Out
        // This is Subclass
        /**/
        // Overloading
        /*
        OverloadingOfSubclass aOverloading = new OverloadingOfSubclass(); // creating object
        // Out
        // This is ASuperclass constructor
        // This is Subclass constructor
        aOverloading.run(1,2);
        /**/
        // OverloadingAndOverriding
        /*
        OverloadingAndOverridingOfSubclass aOverloadingAndOverriding = new OverloadingAndOverridingOfSubclass(); // creating object
        aOverloadingAndOverriding.run(); // super class method
        // Out
        // This is ASuperclass
        aOverloadingAndOverriding.run("runned "); // sub class method
        // Out
        // This is ASuperclass
        // This is Subclass : runned
        /**/
    }
}
