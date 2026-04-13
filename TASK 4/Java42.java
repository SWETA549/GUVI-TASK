
class Voter {
    int voterId;
    String name;
    int age;

    Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(voterId + " " + name + " " + age);
    }
}

public class Java42 {
    public static void main(String[] args) {
        try {
            Voter v = new Voter(101, "Anu", 17);
            v.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}