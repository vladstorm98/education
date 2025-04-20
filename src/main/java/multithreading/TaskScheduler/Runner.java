package multithreading.TaskScheduler;

public class Runner {
    // + Разработайте планировщик задач, где каждая задача имеет приоритет:
    // + Создайте класс Task, который содержит: Имя задачи, Приоритет задачи (TaskPriority).
    // Реализуйте класс TaskScheduler, который: Принимает задачи от разных потоков, выполняет задачи в порядке убывания
    // + приоритета (сначала HIGH, затем MEDIUM, потом LOW)
    // + Используйте BlockingQueue или PriorityQueue для хранения задач.
    // Усложнение: Добавьте возможность динамически изменять приоритет задачи во время выполнения.
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.submitTask(new Task("Something", TaskPriority.LOW));
        scheduler.submitTask(new Task("Something", TaskPriority.HIGH));
        scheduler.submitTask(new Task("Something", TaskPriority.MEDIUM));
        scheduler.submitTask(new Task("Something", TaskPriority.LOW));

        scheduler.start();
    }
}
