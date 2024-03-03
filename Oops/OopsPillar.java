package Oops;

public class OopsPillar {
    public static void main(String[] args) {
        // Fish Shark = new Fish();
        // Shark.color = "Grey";
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum((float) 1.5, (float) 2.5));
        System.out.println(cal.sum(1, 2, 5));
        Fish Shark = new Fish();
        Shark.eat();

    }
}

/*
 * There are basically 4 Pillers of Oops
 * 
 * 1--> Encapsulation
 * It is Wrapping up data and methods(Functions) under a single Unit.It alo
 * implements Data Hiding.(Using Access Specifiers i.e Private,Protected,Public)
 * 
 * 
 * 2--> Inheritance
 * // Inheritance in Java is a fundamental concept in object-oriented
 * programming (OOP) that allows a class (known as the subclass or derived
 * class) to inherit properties and behaviors (methods) from another class
 * (known as the superclass or base class).
 * 
 * 3--> Abstraction
 * 
 * 4--> Polymorphism
 * Poly means many ans morphism means forms
 * 
 * 
 */

// Inheritance

// class Animal {
// String color;

// void eat() {
// System.out.println("I Eat");
// }
// }

// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("I swim");
// }

// }

/*
 * Types Of Inheritance
 * 1 --> Single-level-Inheritance (1 Base Class and 1 Derived Class)
 * 
 * 2 --> Multi-level-Inheritance (1 Base Class and 1st Derived Class - 2nd
 * Derived Class(1st Derived become base for 2nd Derived class ))
 * 
 * 3 --> Hierarchial-Inheritance (1 Base Class and Multiple Derived Class)
 * 
 * 4 --> Hybrid-level-Inheritance (1 Base Class and Multiple Derived Class and
 * Base class)
 * 
 */

/*
 * Types Of Polymorphism
 * 1 --> Compile Time Polymorphism(Static)
 * check many-form at compile time
 * --> Type == Method Overloading (Multiple Functions with same name and but
 * different arguments)
 * 1 --> Compile Time Polymorphism(Dynamic)
 * check many-form at Run time
 * --> Type == Method OverRiding
 * 
 * 
 * 
 * 
 * 
 */

// Method Overloading
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}

// Method OverRiding

class Animal {
    void eat() {
        System.out.println("I Eat");
    }
}

class Fish extends Animal {

    void eat() {
        System.out.println("I Eat Fish");
    }

}