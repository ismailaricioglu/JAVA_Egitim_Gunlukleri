package Konular.konu1.Overriding.Exceptions;

public class UzerineYazilacakAnaSinif {
    void msg1(){System.out.println("Ana Sınıf içerisinde istisna bildirilmeden çalıştı");}
    void msg2(){System.out.println("Ana Sınıf içerisinde istisna bildirilmeden çalıştı");}
    void msg3() throws ArithmeticException {System.out.println("Ana Sınıf içerisinde istisnası çalıştı");}
    void msg4() throws Exception {System.out.println("Ana Sınıf içerisinde istisnası çalıştı");}
    void msg5() throws Exception {System.out.println("Ana Sınıf içerisinde istisnası çalıştı");}
    void msg6() throws Exception {System.out.println("Ana Sınıf içerisinde istisnası çalıştı");}
}
