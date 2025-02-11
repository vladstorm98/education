package tasks.stream_api.order_system;

public class OrderItem {
    private String product;
    private int quantity;
    private double price;

    public OrderItem(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return product + " (x" + quantity + ")";
    }
}
