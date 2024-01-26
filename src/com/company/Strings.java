package com.company;

public class Strings {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,19};//Array arr which reference to object
        int num = 10;
        String name = "Kunal Kushwaha";
        System.out.println(name);

//        String immutability
        String a = "Kunal";
        String b = "Kunal";
        System.out.println(a);
        a="kushwaha";//Object is not changed here but a new object is created here.
        System.out.println(a);

//        String comparison
        String c = "kunal";
        String d = "kunal";

        System.out.println(c == d);

//        HOW TO CREATE DIFFERENT OBJECTS OF SAME VALUE
        String e = new String("Kunal");
        String f = new String ("Kunal");
        String g = new String("Kunal    ");
        System.out.println(e == f);

//        When you only need to check value use .equals method
        System.out.println(e.equals(f));
        System.out.println(e.equals(g));
        System.out.println(e.charAt(0));
    }
}
