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

        //Just declaring the object of Student class
        Student kunal = new Student(13, "Kunal Kushwaha", 96.5f);
//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal .marks = 88.5f;
//        System.out.println(kunal);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        Student rahul = new Student(14, "Rahul", 90.2f);
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
//        kunal.greeting();
//        rahul.greeting();
//        kunal.changeName("Sumit");
//        rahul.changeName("Ravi");
        Student random = new Student(kunal);
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);

        Student random2 = new Student(kunal);
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);
    }
}
class Student {
    int rno = 14;
    String name = "kashish";
    float marks = 90.0f;

    void changeName(String newName) {
        name = newName;
        System.out.println(newName);
    }
    void greeting() {
        System.out.println("Hello, my name is: " + this.name);
    }

    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student () {
//        Calling a constructor from another constructor
//        internally: new Student(15, "Lalit", 82.5f)
        this(15, "Lalit", 82.5f);
    }
//    Student arpit = new Student(17, "Arpit Kohli" , 89.7f);
//    here, this will be replaced arpit and the rnoooo stuff eill be replaced by the values we have passed
    Student(int rnoooo, String names, float marksssss) {
        this.rno = rnoooo;
        this.name= names;
        this.marks = marksssss;
    }
}
