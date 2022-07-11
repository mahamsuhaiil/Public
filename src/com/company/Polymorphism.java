package com.company;

class base{
    private static void display(){
        System.out.println("base private static method");
    }
    public static void print(){
        System.out.println("base class print method");
    }
    /*public final void show(){
        System.out.println("show method of base class");
    }*/ // cannot override private static final methods
    // this is called class to class method hiding
    public void callDisplay(){
        display();
    }
}
class derived extends base{
    private static void display(){
        System.out.println("derived class static method called method hiding");
    }
    public static void print(){
        System.out.println("print method of derived class");
    }
//    public final void show(){
//        System.out.println("show method of base class");
//    } not possible either
}
public class Polymorphism {
    public static void main(String[] args) {
        base b = new derived();
        b.print();
        b.callDisplay();
    }
}
