package tasks.stream_api.task2;

import java.util.List;
import java.util.stream.Collectors;

public class ConverterWithFiltrationAndSort {
    // Отфильтровать товары, у которых цена больше 100.
    // Упорядочить их по убыванию цены.
    // Преобразовать результат в строку с перечнем товаров, разделённых запятой.
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 1200),
                new Product("Phone", 800),
                new Product("Tablet", 150),
                new Product("Headphones", 50),
                new Product("Monitor", 300)
        );

        String result = products.stream()
                .filter(n -> n.getPrice() > 100)
                .sorted((a, b) -> (int) b.getPrice() - (int) a.getPrice())
                .map(Product::getName)
                .collect(Collectors.joining(","));

        System.out.println(result); // Laptop,Phone,Monitor,Tablet
    }
}
