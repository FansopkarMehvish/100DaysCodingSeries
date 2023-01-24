//Day 4 coding Statement:  Write a program to identify of the a number is positive or negative
//Description
//Get an input number from the user and check whether it is a positive or negative number.

import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            System.out.println("Positive Number");
        } else if (i < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Neither positive nor negative");
        }
    }
}

