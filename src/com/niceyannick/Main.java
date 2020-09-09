package com.niceyannick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // Ask for the amount of students
        System.out.println("Please enter the size of your group and press [ENTER]");
        int groupSize = console.nextInt();

        Student[] students = new Student[groupSize];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Please enter the name of student #" + (i + 1) + " and press [ENTER]:");
            Student student = new Student();
            student.name = console.nextLine();
            students[i] = student;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i+1) + ": " + students[i].name);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Is student #" + (i + 1) + "(" + students[i].name + ") present? [Y/N + ENTER]:");
            String isPresent = console.nextLine();
            students[i].isPresent = isPresent.equalsIgnoreCase("y");
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student #" + (i + 1) + ": " + students[i].name + "      | Present: " + students[i].isPresent);
        }
    }
}
