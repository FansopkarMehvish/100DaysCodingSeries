//Day 6 coding Statement:  Write a program to find the Quadrants in which coordinates lie
//Get the value of x and y coordinates as input from the user and check in which quadrant the point lies and print it.

import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("This point lies in First Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("This point lies in Second Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("This point lies in Third Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("This point lies in Fourth Quadrant");
        }
        else if(x==0 && y==0){
            System.out.println("This point lies on Origin");
        }
    }
}
