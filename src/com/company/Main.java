package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");

        int choice = input.nextInt();
        System.out.println(choice);
        if ((choice == 1) || (choice == 2) || (choice == 3) ||(choice == 4) || (choice == 0)) {
            if (choice == 1) {
                System.out.println("Adding a task...");
            } else if (choice == 2) {
                System.out.println("Removing a task...");
            } else if (choice == 3) {
                System.out.println("Updating a task...");
            } else if (choice == 4) {
                System.out.println("Listing all tasks...");
            } else if (choice == 0) {
                System.out.println("Goodbye");


            }
            else{
                System.out.println("Please enter a valid number");
            }

        }
    }
}
