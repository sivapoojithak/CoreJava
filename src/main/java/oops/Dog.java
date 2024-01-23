package oops;
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball");
    }
}
