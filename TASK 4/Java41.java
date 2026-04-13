

class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String msg) {
        super(msg);
    }
}

class NameNotValidException extends Exception {
    NameNotValidException(String msg) {
        super(msg);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Invalid name");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + age + " " + course);
    }
}

public class Java41 {
    public static void main(String[] args) {
        try {
            Student s = new Student(1, "Ramesh", 20, "CSE");
            s.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
