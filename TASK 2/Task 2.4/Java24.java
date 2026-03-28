package task2;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int employeeID;
    double salary;

    // Using super keyword
    Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

class Java24 {
    public static void main(String[] args) {
        Employee emp = new Employee("AAA", 21, 101, 50000);
        emp.display();
    }
}