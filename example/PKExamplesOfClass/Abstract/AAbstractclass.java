package org.example.PKExamplesOfClass.Abstract;

public abstract class AAbstractclass implements AInterface {
    // There are two ways to achieve abstraction in java
    // - Abstract class (0 to 100%)
    // - Interface (100%)

    // Points to Remember
    // An abstract class must be declared with an abstract keyword.
    // It can have abstract and non-abstract methods.
    // It cannot be instantiated.
    // It can have constructors and static methods also.
    // It can have final methods which will force the subclass not to change the body of the method.

    // Rule: If there is an abstract method in a class, that class must be abstract.
    public abstract void run();//no method body and abstract
    public abstract int getNumber();//no method body and abstract

    AAbstractclass(){System.out.println("AAbstractclass is created");}
    public void nonAbstractMethod(){System.out.println("This method is Non Abstract Method");}
    private void nonAbstractMethodAndPrivate(){System.out.println("This method is Non Abstract Method And Private");}
    public void c() {System.out.println("Interface implemente by method c and in AAbstractclass");}
}
