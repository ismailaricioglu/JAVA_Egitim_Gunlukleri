package org.example.PKExamplesOfClass.Inner;

public class MemberInnerClass {
    private int aVariable = 10;

    public class Inner {
        public void msg() {
            System.out.println("Variable value is " + aVariable);
        }
    }
    public static void main(String[] args) {
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.Inner aInner = obj.new Inner();
        aInner.msg();
    }
}

// Internal code generated by the compiler
/*
import java.io.PrintStream;
class MemberInnerClass$Inner
{
    final MemberInnerClass this$0;
    MemberInnerClass$Inner()
    {   super();
        this$0 = MemberInnerClass.this;
    }
    void msg()
    {
        System.out.println((new StringBuilder()).append("data is ")
                .append(MemberInnerClass.access$000(MemberInnerClass.this)).toString());
    }
} /**/