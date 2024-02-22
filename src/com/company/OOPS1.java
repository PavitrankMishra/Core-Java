package com.company;

public class OOPS1 {
    public static void main(String[] args) {


        Student student1 = new Student();//Reference to an object of type student
        //new keyword means dynamically allocated memory & returns a reference to it.
        student1.rno = 45;
        student1.name = "Kunal";
        student1.marks = 90.2f;
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

    }
}

//        Create a class - A named group of properties and functions
//        A object is an instance of a class
//        A class is a template for object
//        Instance variable - Variable inside the class but outside the object
class Student {
    int rno;
    String name;
    float marks;
}