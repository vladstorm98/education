package stream_api.GroupingAndCounting;

// There's a list of workers. Every worker has "department" field. You need to group the workers by departments and
// count how many are in each one. Additionally, for each department, output the average salary.

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker(Department.CRIME, 20_000));
        workerList.add(new Worker(Department.CRIME, 10_000));
        workerList.add(new Worker(Department.MEDICAL, 30_000));
        workerList.add(new Worker(Department.MEDICAL, 40_000));
        workerList.add(new Worker(Department.CRIME, 50_000));

        var countWorkersPerDepartment = workerList.stream()
                .collect(Collectors.groupingBy(Worker::department, Collectors.counting()));

        var averageSalaryPerDepartment = workerList.stream()
                .collect(Collectors.groupingBy(Worker::department, Collectors.averagingInt(Worker::salary)));

        System.out.println(countWorkersPerDepartment);
        System.out.println(averageSalaryPerDepartment);
    }
}
