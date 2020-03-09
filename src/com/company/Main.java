package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Which element of the Fibonacci sequence do you want to calculate?: " );

        int n = sc.nextInt();

        System.out.println( n + "th element of Fibonacci sequence(recurrence) equals: " + FibonacciSequence.fibR(n));
        System.out.println( n + "th element of Fibonacci sequence(iteration) equals: " + FibonacciSequence.fibI(n));
    }
}
