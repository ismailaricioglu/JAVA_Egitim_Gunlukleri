package org.example.PKExamplesOfClass;

import org.example.PKExamplesOfClass.Class.*;
import org.example.PKExamplesOfClass.Inheritance.ASuperclass;
import org.example.PKExamplesOfClass.Inheritance.Hierarchical;
import org.example.PKExamplesOfClass.Inheritance.Reusability;
import org.example.PKExamplesOfClass.PKExamplesOfOver.Overriding.*;
import org.example.PKExamplesOfClass.Polymorphism.*;
import org.example.PKExamplesOfProjects.MiniProject1;
import org.example.PKExamplesOfClass.PKExamplesOfOver.Overriding.*;
import org.example.PKExamplesOfClass.PKExamplesOfOver.Overloading.*;
import org.example.PKExamplesOfClass.PKExamplesOfOver.OverloadingAndOverriding.*;

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
    }
}
