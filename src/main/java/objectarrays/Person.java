package objectarrays;

public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return ssn != null && ssn.equals(person.ssn);
    }


    public static void main(String[] args) {
        Person person1 = new Person(130.0, 80.0, "153-45-6789", "9407581789");
        Person person2 = new Person(155.0, 65.0, "987-65-4321", "9010542467");
        Person person3 = new Person(195.0, 95.0, "153-45-6789", "9010002824");

        System.out.println("person1 equals person2: " + person1.equals(person2));  // false
        System.out.println("person1 equals person3: " + person1.equals(person3));  // true
    }
}
