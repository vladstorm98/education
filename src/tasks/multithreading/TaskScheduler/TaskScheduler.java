package tasks.multithreading.TaskScheduler;

import java.util.concurrent.PriorityBlockingQueue;

public class TaskScheduler {
    private PriorityBlockingQueue<Task> taskQueue = new PriorityBlockingQueue<>();

    public void submitTask(Task task) {
        taskQueue.add(task);
    }

    public void start() {
        new Thread(() -> {
            while (true) {
                try {
                    Task task = taskQueue.take();
                    task.execute();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
