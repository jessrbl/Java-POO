package Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();


            if (idExists(employeeList, id)) {
                System.out.println("Error: Employee ID already exists.");
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                Employee employee = new Employee(id, name, salary);
                employeeList.add(employee);
            }



        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();

        Employee emp = findEmployeeById(employeeList, employeeId);

        if (emp != null) {
            System.out.print("Enter the percentage increase: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        } else {
            System.out.println("Employee not found.");
        }

        sc.close();

        System.out.println();
        System.out.println("List of employees:" );
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    private static Employee findEmployeeById(List<Employee> employeeList, int id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    private static boolean idExists(List<Employee> employeeList, int id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

}
