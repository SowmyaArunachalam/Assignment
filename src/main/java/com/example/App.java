package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<String> todoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void addTask(String task) {
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    public static void viewTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No tasks yet!");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }
}