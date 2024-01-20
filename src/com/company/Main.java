package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to core java");
//        Store 5 roll nos
        int[] numbers = new int[5];

//        Store 5 names
        String[] names = new String[5];

//        data of 5 students: (roll no, name, marks)
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student stud1;//Just declaring the object of Student class
//        System.out.println(Arrays.toString(students));
//        student1 = new Student();
//        New keyword dynamically allocates memory and return a reference to it


//        Create a class
//        Class - Prototype of an object
//        The rules which help to develop object
//        Prototype - Instance of a class
//        Actually visible which uses some rules to be created
//        Instance variable - Variable Inside the o

    }
}
class Student {
    int rno;
    String name;
    float marks;
}
