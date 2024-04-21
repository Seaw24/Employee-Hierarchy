public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getter method for first name
    public String getFirstName() {
        return this.firstName;
    }

    // Getter method for last name
    public String getLastName() {
        return this.lastName;
    }

    // Getter method for Social Security Number
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    // Override toString method to provide formatted employee information
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
            "commission employee", getFirstName(), getLastName(),
            "social security number", getSocialSecurityNumber());
    }
}
