package com.mycompany.app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user details
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your education details: ");
        String education = scanner.nextLine();

        System.out.println("Enter your skills (comma-separated): ");
        String skills = scanner.nextLine();

        System.out.println("Enter your work experience: ");
        String experience = scanner.nextLine();

        // Format the resume
        String resumeContent = "==============================\n";
        resumeContent += "           RESUME            \n";
        resumeContent += "==============================\n";
        resumeContent += "Name: " + name + "\n";
        resumeContent += "Email: " + email + "\n";
        resumeContent += "Education: " + education + "\n";
        resumeContent += "Skills: " + skills + "\n";
        resumeContent += "Experience: " + experience + "\n";
        resumeContent += "==============================\n";

        // Save to a text file
        try (FileWriter writer = new FileWriter("resume.txt")) {
            writer.write(resumeContent);
            System.out.println("Resume successfully created! Check 'resume.txt'.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
