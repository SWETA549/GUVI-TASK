
import java.util.HashMap;

public class Java44 {
    HashMap<String, Integer> map = new HashMap<>();

    void addStudent(String name, int grade) {
        map.put(name, grade);
    }

    void removeStudent(String name) {
        map.remove(name);
    }

    void displayGrade(String name) {
        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Student not found");
        }
    }

    public static void main(String[] args) {
        Java44 obj = new Java44();
        obj.addStudent("Ravi", 85);
        obj.addStudent("Anu", 90);
        obj.displayGrade("Ravi");
        obj.removeStudent("Ravi");
        obj.displayGrade("Ravi");
    }
}