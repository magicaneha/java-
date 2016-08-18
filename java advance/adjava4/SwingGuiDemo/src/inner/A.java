package inner;
public class A {
 private int x;
 private void m1(){
     System.out.println("Hello m1");
 }
 class B extends A{
    void m2(){
        A a=new A();
        System.out.println("x="+a.x);
        a.m1();
        System.out.println("x="+x);
       m1();
    }
}
}

