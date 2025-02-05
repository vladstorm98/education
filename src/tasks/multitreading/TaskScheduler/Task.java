package tasks.multitreading.TaskScheduler;

public class Task implements Comparable<Task>{
    private String name;
    private TaskPriority priority;

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
    }

    public void execute() {
        System.out.printf("Executing %s with %s priority.\n", name, priority);
    }

    @Override
    public int compareTo(Task another) {
        return this.priority.getPriority() - another.priority.getPriority();
    }
}
