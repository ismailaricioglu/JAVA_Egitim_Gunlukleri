package org.example.PKExamplesOfClass.PKExamplesOfOver.OverloadingAndOverriding;

public class OverloadingAndOverridingOfSubclass extends OverloadingAndOverridingOfSuperclass {
    //defining the same method as in the parent class
    public void run(String aString) {
        this.run();
        System.out.println("This is Subclass : " + aString);
    }
}
