package com.company.OOP;
abstract class Animal{
    Animal(){
        System.out.println("Animal class constructed");
    }
    abstract void eat();
    void drink(){
        System.out.println("Animals drinks");
    }
}
interface species{
    void places();
}
public class abstraction extends Animal implements species {
    @Override
    void eat() {
        System.out.println("Animals eats different food");
    }

    @Override
    public void places() {
        System.out.println("Every animal have different habitat");
    }

    public static void main(String[] args) {
        abstraction o = new abstraction();
        o.eat();
        o.places();
        o.drink();
    }
}
