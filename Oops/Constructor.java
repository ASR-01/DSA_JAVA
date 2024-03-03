package Oops;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 21);
        s1.password = "123";
        s1.marks[0] = 100;
        s1.marks[1] = 101;
        s1.marks[2] = 102;
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 104;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
/*
 * 
 * Constructor overloading
 * Constructor overloading is a concept in object-oriented programming where a
 * class can have multiple constructors with different parameter lists. Each
 * constructor provides a different way to initialize an object of the class.
 * 
 */

class Student {
    String name;
    int age;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("I am Non-Parameterised  Constructor");
    }

    Student(String name) {
        marks = new int[3];
        System.out.println("I am  Parameterised  Constructor");
        this.name = name;
    }

    Student(String name, int age) {
        marks = new int[3];
        System.out.println("I am  Parameterised  Constructor");
        this.name = name;
        this.age = age;

    }

    // // Copy Constructor || shallow Copy Constructor
    // Student(Student s1) {
    // // System.out.println("I am Copy -- Constructor");
    // marks = new int[3];
    // this.name = s1.name;
    // this.age = s1.age;
    // this.marks = s1.marks;

    // }

    // Copy Constructor || Deep Copy Constructor
    Student(Student s1) {
        // System.out.println("I am Copy -- Constructor");
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }
}
