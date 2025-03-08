// Name: Ameya Tipnis
// PRN: 23070126012
// Batch: 2023-27 (A1)

import java.util.Scanner;

// Defining main class to run the Duck simulation
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        while (true) {
            // Displaying menu options
            System.out.println("\n--- Duck Simulation ---");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Redhead Duck");
            System.out.println("3. Rubber Duck");
            System.out.println("4. Decoy Duck");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt(); // For reading user input
            Duck duck = null; // Declaring a Duck reference

