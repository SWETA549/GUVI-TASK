package task1;

public class Java16 {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            int num = n;

            for(int j = 1; j <= n; j++) {

                if(j <= i)
                    System.out.print(num--);
                else
                    System.out.print(num+1);

            }

            System.out.println();
        }
    }
}