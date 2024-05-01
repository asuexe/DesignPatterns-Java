package app;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Define a Task class
class Task {
    private String description;
    private Date dueDate;
    private boolean completed;

    public Task(String description, Date dueDate, boolean completed) {
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }
}

// Define a MindfulnessExercise class
class MindfulnessExercise {
    private String name;
    private String description;
    private int duration;

    public MindfulnessExercise(String name, String description, int duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}

// Define a Planner class
class Planner {
    private List<Task> tasks = new ArrayList<>();
    private List<MindfulnessExercise> mindfulnessExercises = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addMindfulnessExercise(MindfulnessExercise exercise) {
        mindfulnessExercises.add(exercise);
    }

    public List<Task> getDueTasks() {
        List<Task> dueTasks = new ArrayList<>();
        Date today = new Date();
        for (Task task : tasks) {
            if (task.getDueDate().equals(today)) {
                dueTasks.add(task);
            }
        }
        return dueTasks;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public List<MindfulnessExercise> getMindfulnessExercises() {
        return mindfulnessExercises;
    }
}



     
