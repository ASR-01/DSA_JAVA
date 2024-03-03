package Oops;

public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        h1.color();
        Chicken c1 = new Chicken();
        c1.eat();
        System.out.println(c1.color);

    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("I eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    void color() {
        color = "Pink";
    }

    void walk() {
        System.out.println("I walk");
    }
}

class Chicken extends Animal {

    void walk() {
        System.out.println("I walk Chick");
    }
}