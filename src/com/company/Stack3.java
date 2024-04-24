//Q.) You are given a number n, representing the size of the array a.
//    You are given n numbers, representing elements of array a.
//    You are required to get next greater element on the right for all elements of array
//    Next greater element of an element x is defined as the first element to the right of x having value greater than x.

package com.company;
import java.util.*;

public class Stack3 {
    public static int[] callAnswer(int[] a) {
        int[] nge = new int[a.length];
        Stack<Integer> st = new Stack<Integer>();

        st.push(a[a.length - 1]);
        for (int i = a.length - 2; i >= 0; i--) {
//            -a+
            while (st.size() > 0 && a[i] >= st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(a[i]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int n = 9;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = callAnswer(a);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]);
        }
    }
}
