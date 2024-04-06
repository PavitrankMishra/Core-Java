//Stock span

package com.company;
import java.util.*;

public class Stack4 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        int[] arr = {1,0,3,4,5,6,1};
        int[] span = new int[arr.length];
        st.push(0);
        span[0] = 1;
        for(int i=1;i<arr.length;i++) {
            while(st.size()>0 && arr[i] >  arr[st.peek()]) {
                st.pop();
            }
            if(st.size() == 0) {
                span[i] = i+1;
            } else {
                span[i] = i-st.peek();
            }
            st.push(i);
        }

        for(int i=0;i<span.length;i++) {
            System.out.print(span[i]);
        }
    }
}
