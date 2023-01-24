//Day 5 coding Statement:  Write a program to identify if the number is even or odd
//Description:
// Get a number as an input from the user and check whether the given number is odd or even

import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
