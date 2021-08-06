package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent() {
        Scanner input = new Scanner(System.in);

        String sid;

        while(true) {
            System.out.println("Please enter student id: ");
            sid = input.nextLine();
            boolean flag = isUsed(sid);
            if (flag) {
                System.out.println("Student already exists");
            } else {
                break;
            }
        }

        System.out.println("Please enter student's first name: ");
        String firstName = input.nextLine();
        System.out.println("Please enter student's last name: ");
        String lastName = input.nextLine();
        System.out.println("Please enter student's age: ");
        String age = input.nextLine();
        System.out.println("Please enter student's address: ");
        String address = input.nextLine();

        Student s = new Student(sid, firstName, lastName, age, address);
        students.add(s);

        System.out.println("Student added successfully");
    }

    public void deleteAStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the id of the student you want to remove: ");
        String sid = input.nextLine();

        int index = -1;

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                students.remove(i);
                break;
            }
        }
        if (index == -1) {
            System.out.println("Student does not exist");
        } else {
            System.out.println("Student successfully deleted");
        }
    }

    public void lookUpAllStudents() {
        if (students.size() == 0) {
            System.out.println("No result");
            return;
        }
        System.out.println("sid\tfirst name\tlast name\tage\taddress");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getSid()+"\t\t"+s.getFirstName()+"\t\t"+s.getLastName()+"\t\t"+s.getAge()+"\t\t"+s.getAddress());
        }
    }

    public void updateAStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the id of the student you want to update: ");
        String sid = input.nextLine();

        System.out.println("Please enter the new first name");
        String firstName = input.nextLine();
        System.out.println("Please enter the new last name");
        String lastName = input.nextLine();
        System.out.println("Please enter the new age");
        String age = input.nextLine();
        System.out.println("Please enter the new address");
        String address = input.nextLine();

        Student s = new Student(sid, firstName, lastName, age, address);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getSid().equals(sid)) {
                students.set(i, s);
                break;
            }
        }

        System.out.println("Student updated successfully");
    }

    public boolean isUsed(String sid) {
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
