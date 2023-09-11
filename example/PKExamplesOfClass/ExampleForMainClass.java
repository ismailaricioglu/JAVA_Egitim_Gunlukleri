package org.example.PKExamplesOfClass;

import org.example.PKExamplesOfClass.Abstract.AAbstractclass;
import org.example.PKExamplesOfClass.Abstract.Class1IsInheritanceOfAbstract;
import org.example.PKExamplesOfClass.Abstract.Class2IsInheritanceOfAbstract;
import org.example.PKExamplesOfClass.Abstract.*;
import org.example.PKExamplesOfClass.Interface.AClass;
import org.example.PKExamplesOfClass.Interface.AInterface;
import org.example.PKExamplesOfClass.Interface.ASubInterface;
import org.example.PKExamplesOfClass.Interface.*;

public class ExampleForMainClass {
    public static void ExampleForMainClass() {
        // Mini Project
        /*
        MiniProject1 examplesOfMiniProject1 = new MiniProject1(-1,6,100,0,5);
        Runnable runnable = () -> AClassStatic.Run();
        System.out.println(runnable.getClass().getTypeName());/**/

        // Classes
        /*
        AClass aClass = new AClass(1,2,3,-1,0,10,-9);/**/
        // Static
        /*
        AClassStatic.Run();
        AClassStatic aClassStatic = new AClassStatic("init class run");
        aClassStatic.Run();/**/

        // Inheritance
        /*
        ASuperclass examplesOfInheritanceSuperclass = new ASuperclass();
        var o = examplesOfInheritanceSuperclass.nameOfSuperclass;
        System.out.println(examplesOfInheritanceSuperclass.toString());
        Subclass examplesOfInheritanceSubclass = new Subclass();
        var o1 = examplesOfInheritanceSubclass.nameOfSuperclass;
        var o2 = examplesOfInheritanceSubclass.nameOfSubclass;
        System.out.println(examplesOfInheritanceSubclass.toString());
        Reusability examplesOfInheritanceReusability = new Reusability();
        var o3 = examplesOfInheritanceReusability.nameOfSuperclass;
        var o4 = examplesOfInheritanceReusability.nameOfReusability;
        System.out.println(examplesOfInheritanceReusability.toString());
        Hierarchical examplesOfInheritanceHierarchical = new Hierarchical();
        var o5 = examplesOfInheritanceHierarchical.nameOfSuperclass;
        var o6 = examplesOfInheritanceHierarchical.nameOfReusability;
        var o7 = examplesOfInheritanceHierarchical.nameOfHierarchical;
        System.out.println(examplesOfInheritanceHierarchical.toString());/**/

        // Polymorphism
        /*
        // "Kalıtım" ve "Polimorfizm" Neden ve Ne Zaman Kullanılmalı?
        // - Kodun yeniden kullanılabilirliği açısından faydalıdır: yeni bir sınıf oluşturduğunuzda mevcut sınıfın niteliklerini ve yöntemlerini yeniden kullanın.
        // classOfBase IS-A ClassOfBase
        ClassOfBase classOfBase = new ClassOfBase();
        // subFirstClass IS-A ClassOfBase
        ClassOfBase subFirstClass = new SubFirstClass(); // upcasting
        // subSecondClass IS-A ClassOfBase
        ClassOfBase subSecondClass = new SubSecondClass(); // upcasting
        classOfBase.MethodOfBase();
        // Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.
        subFirstClass.MethodOfBase(); // Example of Java Runtime Polymorphism
        subSecondClass.MethodOfBase(); // Example of Java Runtime Polymorphism
        // This example is also given in method overriding but there was no upcasting.
        ClassOfBase classOfBaseNotUpcasting;
        classOfBaseNotUpcasting = new SubFirstClass();
        classOfBaseNotUpcasting.MethodOfBase(); // Example of Java Runtime Polymorphism
        classOfBaseNotUpcasting = new SubSecondClass();
        classOfBaseNotUpcasting.MethodOfBase(); // Example of Java Runtime Polymorphism
        // Runtime polymorphism can't be achieved by data members.
        System.out.println(classOfBaseNotUpcasting.number); // 100
        classOfBaseNotUpcasting = new MultilevelInheritanceClass();
        classOfBaseNotUpcasting.MethodOfBase(); // Example of Java Runtime Polymorphism
        classOfBaseNotUpcasting.AlternativeMethodOfBase();
        // /**/
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
         */
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
        // Abstract
        /*
        AAbstractclass obj = new Class1IsInheritanceOfAbstract(); // creating object and run contructor
        obj.run(); // from this Class1IsInheritanceOfAbstract
        System.out.println(obj.getNumber()); // from this Class1IsInheritanceOfAbstract
        obj = new Class2IsInheritanceOfAbstract(); // creating object and run contructor
        obj.nonAbstractMethod(); // from this AAbstractclass
        obj.run(); // from this Class2IsInheritanceOfAbstract
        System.out.println(obj.getNumber()); // from this Class2IsInheritanceOfAbstract

        obj.a(); // empty
        obj.b(); // empty
        obj.c(); // loaded - parent abstract
        obj.d(); // empty

        obj = new Class1IsInheritanceOfAbstract(); // creating object
        obj.a(); // loaded - parent child
        obj.b(); // loaded - parent child
        obj.c(); // loaded - parent abstract
        obj.d(); // loaded - parent child
        /**/
        // Interface
        /*
        AInterface.Paymentable aPaymentable = new AClass();
        aPaymentable.cash();
        aPaymentable.note();
        ASubInterface.Defer aDefer = new AClass();
        aDefer.cash();
        aDefer.note();
        System.out.println("Tis is static method " + ASubInterface.Defer.deferred(3));
        /**/
        // StaticBlock
        /*
        static {
            System.out.println("static block is invoked");
            System.exit(0); // app exit
        }
        /**/
        // StaticVariables
        /*
        StaticVariables s1 = new StaticVariables((byte) 10, "Gökhan");
        StaticVariables s2 = new StaticVariables((byte) 11, "Melisa");
        //we can change the college of all objects by the single line of code
        StaticVariables.staticString = "this modified content, the same data can be accessed from anywhere";
        s1.run();
        s2.run();
        /**/
        // StaticVariables
        /*
        StaticMethods.change();//calling change method
        StaticMethods s1 = new StaticMethods((byte) 10, "Gökhan");
        StaticMethods s2 = new StaticMethods((byte) 11, "Melisa");
        //we can change the college of all objects by the single line of code
        StaticMethods.staticString = "this modified content, the same data can be accessed from anywhere";
        s1.run();
        s2.run();
        /**/
    }
}
