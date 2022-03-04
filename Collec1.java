
import java.util.ArrayList;
import java.util.List;

class Employee {
    protected long employeeId;
    protected String firstName;
    protected String lastName;

    public Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(501, "Nithin", "Kumar");
        Employee e2 = new Employee(101, "rahul", "p");
        Employee e3 = new Employee(101, "Jaya", "Krishna");
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.forEach(System.out::println);

    }

}
