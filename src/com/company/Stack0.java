package com.company;
import java.util.*;

public class Stack0 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st.peek();
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + "->" + " " + st.size());
    }
}
