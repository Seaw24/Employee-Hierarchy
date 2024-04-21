import java.util.Scanner;
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
    

    System.out.printf("Last name : %s%n", employee.getLastName());
    System.out.printf("First name : %s%n", employee.getFirstName());
    System.out.printf("Social security number is : %s%n", employee.getSocialSecurityNumber());
    System.out.printf("Gross sale : %.2f%n", employee.getGrossSales());
    System.out.printf("Commission rate : %.2f%n", employee.getCommissionRate());
    System.out.printf("Base salary : %s%n", employee.getBaseSalary());


    System.out.printf("updated information%n");

    System.out.printf("input Gross sale%n");
    int grossSale = input.nextInt();
    employee.setGrossSales(grossSale);

    System.out.printf("input Commission rate%n");
    int commissionRate = input.nextInt();
    employee.setCommissionRate(commissionRate);

    System.out.printf("input Base salary%n");
    int baseSalary = input.nextInt();
    employee.setBaseSalary(baseSalary);

    System.out.printf("%s", employee.toString());
    }
}


