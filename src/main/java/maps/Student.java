package maps;
import java.util.HashMap;

public class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    // Constructor
    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }
}
