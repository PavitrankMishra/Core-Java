//Q.)You are given a string expression representing an expression.
//   Assuming that the string is balanced you are required to print true if brackets are extra or there are duplicate brackets.

package com.company;
import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch ==')') {
                if(st.peek() == '(') {
                    System.out.println(true);
                    return ;
                } else {
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println("Balanced String");
    }
}
