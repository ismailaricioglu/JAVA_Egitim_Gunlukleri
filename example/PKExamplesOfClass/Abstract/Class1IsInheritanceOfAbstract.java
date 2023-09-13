package org.example.PKExamplesOfClass.Abstract;

public class Class1IsInheritanceOfAbstract extends  AAbstractclass {

    @Override
    public void run() { System.out.println("This class 1 is extends AAbstractclass"); }
    public int getNumber() { return 1; }

    @Override
    public void a() {
        System.out.println("Interface implemente by method a and in AAbstractclass");
    }

    @Override
    public void b() {
        System.out.println("Interface implemente by method b and in AAbstractclass");
    }

    @Override
    public void d() {
        System.out.println("Interface implemente by method d and in AAbstractclass");
    }
}
