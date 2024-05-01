package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class exe {
    public static void main(String[] args) throws ParseException {
        Planner planner = new Planner();
        try (Scanner scanner = new Scanner(System.in)) {
			// Add tasks and mindfulness exercises based on user input
			while (true) {
			    System.out.println("Enter 't' to add a task, \n'm' to add a mindfulness exercise, or \n'q' to quit:");
			    String input = scanner.nextLine();

			    if (input.equals("t")) {
			        System.out.println("Enter a task description:");
			        String description = scanner.nextLine();
			        System.out.println("Enter the due date (yyyy-mm-dd):");
			        String dateStr = scanner.nextLine();
			        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			        Date dueDate = dateFormat.parse(dateStr);
			        Task task = new Task(description, dueDate, false);
			        planner.addTask(task);
			    } else if (input.equals("m")) {
			        System.out.println("Enter a mindfulness exercise name:");
			        String name = scanner.nextLine();
			        System.out.println("Enter a description:");
			        String description = scanner.nextLine();
			        System.out.println("Enter the duration (in minutes):");
			        int duration = scanner.nextInt();
			        scanner.nextLine(); // consume the remaining newline character
			        MindfulnessExercise exercise = new MindfulnessExercise(name, description, duration);
			        planner.addMindfulnessExercise(exercise);
			    } else if (input.equals("q")) {
			        break;
			    }
			}
		}
    }
}
