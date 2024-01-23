package oops;
public class Product {
    private double price;

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded method for price getter
    public double getPrice(int quantity) {
        // Calculate total price based on quantity
        return price * quantity;
    }
}
