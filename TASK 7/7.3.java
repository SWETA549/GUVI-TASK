import java.util.Arrays;
import java.util.List;

public class Q3_Students {
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
            "Arun",
            "Anitha",
            "Rahul",
            "Aakash",
            "Priya",
            "Karthik",
            "Anu",
            "Vijay",
            "Sneha",
            "Aishwarya"
        );

        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}