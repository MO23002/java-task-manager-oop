package com.angelamena.tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nTASK MANAGER | 1 Add | 2 List | 3 Complete | 4 Remove | 5 Pending | 0 Exit");
                String choice = scanner.nextLine().trim();
                if (choice.equals("0")) break;
                switch (choice) {
                    case "1" -> {
                        System.out.print("Description: ");
                        try { System.out.println("Created task #" + manager.add(scanner.nextLine()).getId()); }
                        catch (IllegalArgumentException ex) { System.out.println(ex.getMessage()); }
                    }
                    case "2" -> manager.all().forEach(Main::printTask);
                    case "5" -> manager.pending().forEach(Main::printTask);
                    case "3", "4" -> {
                        System.out.print("Task ID: ");
                        try {
                            int id = Integer.parseInt(scanner.nextLine().trim());
                            boolean ok = choice.equals("3") ? manager.complete(id) : manager.remove(id);
                            System.out.println(ok ? "Updated successfully" : "Task not found");
                        } catch (NumberFormatException ex) { System.out.println("Enter a valid numeric ID"); }
                    }
                    default -> System.out.println("Choose a valid option");
                }
            }
        }
    }

    private static void printTask(Task task) {
        System.out.printf("#%d [%s] %s%n", task.getId(), task.isCompleted() ? "done" : "pending", task.getDescription());
    }
}
