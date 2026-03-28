package task2;
class Person {
    String name;
    int age;
    Person() {
        age = 18;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Java21 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Default Person";
        p1.display();

        Person p2 = new Person("Sweta", 20);
        p2.display();
    }
}
