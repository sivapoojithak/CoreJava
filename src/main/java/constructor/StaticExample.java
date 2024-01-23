package constructor;
public class StaticExample {
    static int staticVariable;

    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {
        StaticExample.staticVariable = 90;
        System.out.println("Static Variable: " + StaticExample.getStaticVariable());
    }
}
