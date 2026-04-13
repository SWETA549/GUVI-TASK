
import java.util.Scanner;

public class Java43 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        try {
            int index = sc.nextInt();
            System.out.println(days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day index. Enter value between 0 and 6.");
        }
    }
}