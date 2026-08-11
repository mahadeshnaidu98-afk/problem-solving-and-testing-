import java.util.Arrays;

class Employee {
    String department;
    int salary;

    Employee(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("CSE", 50000),
            new Employee("ECE", 75000),
            new Employee("AIML", 60000),
            new Employee("MECH", 40000)
        };

        Arrays.stream(employees)
              .sorted((a, b) -> Integer.compare(b.salary, a.salary))
              .forEach(e ->
                  System.out.println(e.department + " " + e.salary)
              );
    }
}