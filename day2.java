//Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.
//Description:
//Take an input character from user and check whether it is an alphabet or not.

import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if ((input >= 97 && input <= 122) || (input >= 65 && input <= 90)) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}