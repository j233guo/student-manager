package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        StudentManager studentManager = new StudentManager(studentList);

        while (true) {
            System.out.println("---------- Student Management System ----------");
            System.out.println("1 Add a student");
            System.out.println("2 Delete a student");
            System.out.println("3 Update a student");
            System.out.println("4 Look up all students");
            System.out.println("5 Quit");
            System.out.println("Please enter an option");

            Scanner input = new Scanner(System.in);
            String line = input.nextLine();

            switch (line) {
                case "1":
                    studentManager.addStudent();
                    break;
                case "2":
                    studentManager.deleteAStudent();
                    break;
                case "3":
                    studentManager.updateAStudent();
                    break;
                case "4":
                    studentManager.lookUpAllStudents();
                    break;
                case "5":
                    System.out.println("Thank you for using");
                    System.exit(0);
            }
        }

    }
}
