
import percentage.Calc;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> ID = new ArrayList<>();
        List<String> Name = new ArrayList<>();
        List<Double> Salary = new ArrayList<>();



        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("ID:");
            ID.add(sc.nextInt());
            System.out.print("Name:");
            sc.nextLine();
            Name.add(sc.nextLine());
            System.out.print("Salary:");
            Salary.add(sc.nextDouble());

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeID = sc.nextInt();

        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();
        Calc calc = new Calc(percentage);


        for (int i = 0; i < n; i++) {
            if (ID.get(i) == employeeID) {
               double increaseSalary = calc.calcularAumento(Salary.get(i));
               Salary.set(i, increaseSalary);
            }
        }

        System.out.println("\nList of employees: ");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + ID.get(i) + ", Name: " + Name.get(i) + ", Salary: " + Salary.get(i));
        }


        sc.close();

        }
    }
