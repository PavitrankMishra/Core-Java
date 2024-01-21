package com.company;

public class wrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        Integer num = 45;

        Integer a = 10;
        Integer b = 20;
//
        swap(a,b);

        System.out.println(a + " " + b);

        final A kunal =  new A("Kunal Kushwaha");
        kunal.name = "other name";

//        When a non primitive is final, it can not be reassigned
//        kunal = new A("new object");
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        temp = b;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}