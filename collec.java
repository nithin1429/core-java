import java.util.ArrayList;
import java.util.List;
import java.Comparable;
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

    public boolean isEqual(Employee other) {

        if (this == other)
            return true;
        if(other==null)
            return false;
        if(getClass()!=other.getClass())
        return false;
        Employee o=(Employee)other;
        if(employeeId!=o.employeeId)
        return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    @Override
    //public int compareTo(Employee other){
       // if(this.employeeId<other.employeeId) return -1;
      //  else if(this.employeeId==other.employeeId) return 0;
       // return 1;
       return (int)(this.employeeId-other.employeeId);
   // }
   public static Employee[] bubble(Employee[] e){
       int n=e.length;
       for(itn i=0;i<n;i++){
           for(int j=0;j<n-1-i;j++){
               if(e[j].employeeId>e[j+1.employeeId]){
                   Employee temp=new Employee(0,"","");
                   temp=e[j];
                   e[j]=e[j+1];
                   e[j+1]=temp;
               }
           }
       }
   }
}

public class collec {
    public static void main(String[] args) {
        Employee e1 = new Employee(501, "Nithin", "Kumar");
        Employee e2 = new Employee(501, "Nithin", "P");
        Employee e3 = new Employee(503, "Jaya", "krishna");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.forEach(System.out::println);
        System.out.println(e1.isEqual(e2));
      //  System.out.println(e1.compareTo(e2));
System.out.println(bubble(employees));
    }

}
