package org.example.PKExamplesOfClass.PKExamplesOfOver.Overriding;

public class OverridingOfSubclass extends OverridingOfSuperclass {
    //defining the same method as in the parent class
    public void run() {
        System.out.println("This is Subclass");
    }
    //void msg(){System.out.println("Hello java");} // this is protected in SuperClass, C.T.Error
}
