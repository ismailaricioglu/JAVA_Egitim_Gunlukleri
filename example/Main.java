package org.example;

public class Main {
    public static void main(String[] args) {
        // Mini Project
        //ExamplesOfMiniProject1 examplesOfMiniProject1 = new ExamplesOfMiniProject1(-1,6,100,0,5);
        //Runnable runnable = () -> ExamplesOfClassStatic.Run();
        //System.out.println(runnable.getClass().getTypeName());

        // Classes
        //ExamplesOfClass examplesOfClass = new ExamplesOfClass(1,2,3,-1,0,10,-9);
        ExamplesOfClassStatic.Run();
        ExamplesOfClassStatic examplesOfClassStatic = new ExamplesOfClassStatic("init class run");
        examplesOfClassStatic.Run();

        // Inheritance
        /*
        ExamplesOfInheritanceSuperclass examplesOfInheritanceSuperclass = new ExamplesOfInheritanceSuperclass();
        var o = examplesOfInheritanceSuperclass.nameOfSuperclass;
        System.out.println(examplesOfInheritanceSuperclass.toString());
        ExamplesOfInheritanceSubclass examplesOfInheritanceSubclass = new ExamplesOfInheritanceSubclass();
        var o1 = examplesOfInheritanceSubclass.nameOfSuperclass;
        var o2 = examplesOfInheritanceSubclass.nameOfSubclass;
        System.out.println(examplesOfInheritanceSubclass.toString());
        ExamplesOfInheritanceReusability examplesOfInheritanceReusability = new ExamplesOfInheritanceReusability();
        var o3 = examplesOfInheritanceReusability.nameOfSuperclass;
        var o4 = examplesOfInheritanceReusability.nameOfReusability;
        System.out.println(examplesOfInheritanceReusability.toString());
        ExamplesOfInheritanceHierarchical examplesOfInheritanceHierarchical = new ExamplesOfInheritanceHierarchical();
        var o5 = examplesOfInheritanceHierarchical.nameOfSuperclass;
        var o6 = examplesOfInheritanceHierarchical.nameOfReusability;
        var o7 = examplesOfInheritanceHierarchical.nameOfHierarchical;
        System.out.println(examplesOfInheritanceHierarchical.toString());*/
    }
}
