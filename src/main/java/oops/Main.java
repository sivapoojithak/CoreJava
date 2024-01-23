package oops;
public class Main {
    public static void main(String[] args) {
        SubDepartment subDepartment = new SubDepartment(10);
        System.out.println("Department Size: " + subDepartment.getDepartmentSize());


        Product product = new Product();
        product.setPrice(10.5);
        System.out.println("Total Price: $" + product.getPrice(5));
        System.out.println(product.getPrice());

        Animal animal = new Animal();
        Dog dog = new Dog();

        Animal newDog = new Dog();
        animal.makeSound();
        dog.makeSound();
        newDog.makeSound();
    }
}
