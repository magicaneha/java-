package exceptiondemo;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
       int a,b,c;
   Scanner sc=new Scanner(System.in);
        System.out.println("enter anumber");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        try{
        c=a/b;//A.E-> new A.E()
        }
        catch(Exception e){
            e.printStackTrace();
        c=0;
            System.out.println("invalid second value please do not enter zero");
        }
        System.out.println("c="+c);
    }
    
}
