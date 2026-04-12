
package task3;

import java.util.Scanner;

// Interface Taxable
interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;

    double calcTax();
}

// Employee class
class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double calcTax() {
        return salary * incomeTax;
    }
}

// Product class
class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax() {
        return price * salesTax;
    }
}

// Main class
public class Java32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee input
        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empId, name, salary);

        // Product input
        System.out.println("Enter Product ID:");
        int pid = sc.nextInt();

        System.out.println("Enter Product Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Product Quantity:");
        int quantity = sc.nextInt();

        Product prod = new Product(pid, price, quantity);

        // Output
        System.out.println("\nIncome Tax on Employee Salary: " + emp.calcTax());
        System.out.println("Sales Tax on Product: " + prod.calcTax());

        sc.close();
    }
}
