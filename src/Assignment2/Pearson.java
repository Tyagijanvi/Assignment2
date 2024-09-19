package Assignment2;

public class Pearson {
	 // Encapsulated fields
    private String name;
    private int age;
    private String address;

    // Constructor
    public Pearson (String name, int age, String address) {
        this.name = name;
        setAge(age);  // Using the setter to ensure the validation
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // Creating a Person object
        Pearson person = new Pearson("Janvi tyagi", 30, "123 Main St");

        // Accessing fields using getter methods
        System.out.println("Name: " + person.getName());       // Output: Janvi tyagi
        System.out.println("Age: " + person.getAge());         // Output: 30
        System.out.println("Address: " + person.getAddress()); // Output: 123 Main St

        // Modifying fields using setter methods
        person.setName("Jahanvi tyagi");
        person.setAge(25);
        person.setAddress("456 Elm St");

        // Accessing modified values
        System.out.println("Updated Name: " + person.getName());       // Output: Jahanvi tyagi
        System.out.println("Updated Age: " + person.getAge());         // Output: 25
        System.out.println("Updated Address: " + person.getAddress()); // Output: 456 Elm St

        // Trying to set a negative age
        person.setAge(-5); // Output: Age cannot be negative.
        System.out.println("Final Age: " + person.getAge()); ; // Output: 25 (unchanged)

    }

}
