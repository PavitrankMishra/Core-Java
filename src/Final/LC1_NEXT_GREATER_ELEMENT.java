package Final;

import java.util.*;
public class LC1_NEXT_GREATER_ELEMENT {
    public static int[] callAnswer(int[] a) {
        int[] nge = new int[a.length];

        nge[a.length-1] = -1;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=a.length-2;i>=0;i--) {
            while(st.size() > 0 && a[i] >= st.peek()) {
                st.pop();
            }

            if(st.size() == 0) {
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
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = callAnswer(arr);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
