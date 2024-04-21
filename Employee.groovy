public class Employee{
    private final String firstName;                              
    private final String lastName;                               
    private final String socialSecurityNumber;  

public Employee (String firstName, String lastName, 
    String socialSecurityNumber){
        this.firstName = firstName;                                    
        this.lastName = lastName;                                    
        this.socialSecurityNumber = socialSecurityNumber;    
}

   // return first name
   public String getFirstName() {
    return commissionEmployee.getFirstName();
 }

 // return last name
 public String getLastName() {
    return commissionEmployee.getLastName();
 } 

 // return social security number
 public String getSocialSecurityNumber() {
    return commissionEmployee.getSocialSecurityNumber();
 }

 public String toString() {
    return String.format("%s: %s %s%n%s: %s",
    "commission employee", getFirstName(), getLastName(), 
     "social security number", getSocialSecurityNumber()); 
}
}
