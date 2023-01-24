//Day 1 coding Statement: Write a program to identify if the character is a vowel or consonant.
//Description of the program:
//Take an input character from the user and check whether the given input is a vowel or consonant.

import java.util.Scanner;
public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if ((input >= 97 && input <= 122) || (input >= 65 && input <= 90)) {
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A' || input
                    == 'E' || input == 'I' || input == 'O' || input == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}