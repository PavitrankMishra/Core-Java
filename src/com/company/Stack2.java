//You are given a string expression check if it is balanced or not

package com.company;
import java.util.*;

public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if(ch == ')'){
                handleClosingStack(st, '(');
            } else if(ch == '}') {
                handleClosingStack(st, '{');
            } else if(ch == ']') {
                handleClosingStack(st, '[');
            }
        }

        if(st.size()==0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
         System.out.println("The stack is:" + st );
    }
    public static void handleClosingStack(Stack<Character> st, char element) {
        if(st.size() == 0){
            System.out.println("Not balanced");
            return ;
        } else if(st.peek() != element){
            System.out.println("Not balanced");
            return;
        } else {
            st.pop();
        }
    }
}
