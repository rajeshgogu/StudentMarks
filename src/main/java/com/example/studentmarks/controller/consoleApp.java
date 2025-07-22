package com.example.studentmarks.controller;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.studentmarks.model.student;
import com.example.studentmarks.service.studentRegister;

@Component
public class consoleApp implements CommandLineRunner {

    private final studentRegister register;

    public consoleApp(studentRegister register) {
        this.register = register;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Marks Register ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Show Average Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = scanner.nextInt();
                    break;

                case 2:
                    register.getAllStudents().forEach(System.out::println);
                    break;

                case 3:
                    System.out.printf("Average Marks: %.2f\n", register.getAverageMarks());
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

