package tasks.streams.task1;

public class Worker {
     String department;
    private int salary;

    public Worker(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}
