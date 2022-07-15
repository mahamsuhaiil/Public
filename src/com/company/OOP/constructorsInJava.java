package com.company.OOP;

class A{
    //From within a constructor, you can also use the this keyword to call another constructor in the same class. Doing so is called an explicit constructor invocation.
    A(){
        this(0);
        System.out.println("empty attributes");
    }
    A(int x){
        this(0, 0);
        System.out.println("one attribute");
    }
    A(int x, int y){
        System.out.println("many attributes");
    }

}

public class constructorsInJava {
    public static void main(String[] args) {
        A a = new A();
    }
}
