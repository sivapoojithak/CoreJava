package constructor;

public class ChildClass extends ParentClass {
    int childInstanceVariable;

    public ChildClass(int parentValue, int childValue) {
        super(parentValue);
        this.childInstanceVariable = childValue;
    }

    public ChildClass(int childValue) {
        super(7);
        this.childInstanceVariable = childValue;
    }

    public static void main(String[] args) {
        ChildClass child1 = new ChildClass(10, 20);
        System.out.println(child1.parentInstanceVariable);
        System.out.println(child1.childInstanceVariable);

        ChildClass child2 = new ChildClass(3);
        System.out.println(child2.parentInstanceVariable);
        System.out.println(child2.childInstanceVariable);
    }
}
