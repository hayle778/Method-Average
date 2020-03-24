package com.example.demo;

import java.util.Scanner;

public class Met {

public static void main(String[]args) {

    Scanner input = new Scanner(System.in);


//int a, b, c;
    double avg = 0.0;
    System.out.println("Input integer:");
    int a = input.nextInt();
    System.out.println("Input integer:");
    int b = input.nextInt();
    System.out.println("Input integer");
    int c = input.nextInt();

    // the bottom one is calling the method

    System.out.println("The average of those three integer is: "+ avg(a, b, c));

}

    private static double avg(int a, int b, int c) {

        double avg = (a+b+c)/3;

       // System.out.println("The average of those three integer is: "+ avg);
        return avg;


}

}


