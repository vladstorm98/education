package multithreading.SystemOfProcessingOrders;

public class Runner {
    public static void main(String[] args) {
        // Создайте систему для обработки интернет-заказов. У каждого заказа есть статус, который описывается с
        // помощью enum: NEW, PROCESSING, SHIPPED, DELIVERED.
        // Создайте класс Order, который содержит: ID заказа, Статус заказа (OrderStatus).
        // Реализуйте несколько потоков (Thread или Runnable), которые обрабатывают заказы, изменяя их статус:
        // Из NEW в PROCESSING, Из PROCESSING в SHIPPED, Из SHIPPED в DELIVERED.
        // Обеспечьте потокобезопасность при изменении статуса заказа (например, используя synchronized или ReentrantLock).
        // Усложнение: Добавьте случайные задержки (Thread.sleep), чтобы симулировать реальное время обработки заказа.
        OrderProcessor order1 = new OrderProcessor(new Order(1));
        OrderProcessor order2 = new OrderProcessor(new Order(2));
        OrderProcessor order3 = new OrderProcessor(new Order(3));

        order1.start();
        order2.start();
        order3.start();
    }
}

