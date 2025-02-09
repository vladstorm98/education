package tasks.stream_api.task1;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    // У тебя есть список сотрудников. Каждый сотрудник имеет поле "отдел". Нужно сгруппировать сотрудников по отделам
    // и подсчитать, сколько сотрудников в каждом отделе. Дополнительно для каждого отдела вывести среднюю зарплату.
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Crime", 20000));
        workerList.add(new Worker("Crime", 10000));
        workerList.add(new Worker("Medical", 30000));
        workerList.add(new Worker("Medical", 40000));
        workerList.add(new Worker("Crime", 50000));

        Map<String, Long> countWorkersPerDepartment = workerList.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment, Collectors.counting()));

        Map<String, Double> averageSalaryPerDepartment = workerList.stream()
                .collect(Collectors.groupingBy(Worker::getDepartment, Collectors.averagingInt(Worker::getSalary)));

        System.out.println(countWorkersPerDepartment);
        System.out.println(averageSalaryPerDepartment);
    }
}
