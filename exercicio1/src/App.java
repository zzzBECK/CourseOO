import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Integer n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            
            Integer id; String name; Double salary;

            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = Double.parseDouble(sc.nextLine());

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }

        for (Employee emp : list){
            System.out.println(emp.toString());
        }

        System.out.print("Enter de employee id that will have salary increased: ");
        Integer id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : list){

            if (emp.getId().intValue() == id.intValue()){
                System.out.print("Enter the percentage: ");
                emp.increaseSalary(Double.parseDouble(sc.nextLine()));
            }
        }

        for (Employee emp : list){
            System.out.println(emp.toString());
        }
        
        sc.close();
    }
}
