// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class positiveOrNegavity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to check weather the given number is Positive or negative: ");
        int n=sc.nextInt();

        if (n>0) {
            System.out.println("The Given Number "+n+" is Positive");
        }
        else{
            System.out.println("The Given Number "+n+" is Negative");
        }

    }
}
