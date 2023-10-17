/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Type 'add' to add a task, 'list' to list tasks, 'search' to search tasks, or 'exit' to quit:");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.print("Enter a task: ");
                String newTask = scanner.nextLine();
                todoList.add(newTask);
                System.out.println("Task added: " + newTask);
            } else if (command.equalsIgnoreCase("list")) {
                if (todoList.isEmpty()) {
                    System.out.println("No tasks to display.");
                } else {
                    System.out.println("Tasks:");
                    for (int i = 0; i < todoList.size(); i++) {
                        System.out.println((i + 1) + ". " + todoList.get(i));
                    }
                }
            } else if (command.equalsIgnoreCase("search")) {
                System.out.print("Enter a keyword to search for: ");
                String keyword = scanner.nextLine();
                System.out.println("Matching tasks:");
                int count = 0;
                for (String task : todoList) {
                    if (task.contains(keyword)) {
                        System.out.println(task);
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("No matching tasks found.");
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid command. Please type 'add', 'list', 'search', or 'exit'.");
            }
        }

        scanner.close();

    }
}
