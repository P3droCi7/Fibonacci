package com.company;

public class FibonacciSequence {

//recursive version
    public static int fibR(int n) {
        if (n < 2) return n; // if  n<2 return n (for 0 and 1)
        return fibR(n - 1) + fibR(n - 2);
    }

//iterative version
    public static int fibI(int n) {
        int elementA = 0; //preceding previous elementB
        int elementB = 1; //previous element
        int result = 0;

        if (n < 2) return n; // if  n<2 return n (for 0 and 1)
        for (int i = 2; i <= n; i++) {
            result = elementA + elementB; //sum of two elements
            elementA = elementB; //modyfication of variables
            elementB = result;  //modyfication of variables
        }
        return result;
    }
}
