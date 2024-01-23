package objectarrays;

public class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;


    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    @Override
    public String toString() {
        return "Product{" + "weight=" + weight + ", price=" + price + ", id=" + id + '}';
    }

    // Example usage
    public static void main(String[] args) {

        Product product1 = new Product(5.6, 29.97, 108);
        Product product2 = new Product(4.0, 50.11, 110);

        int result = product1.compareTo(product2);

        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " has the same price as " + product2);
        }
    }
}