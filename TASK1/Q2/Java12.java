package task1;
import java.util.Scanner;

public class Java12 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("Number "+n+" is negative");
		}
		else {
			System.out.println("Number "+n+" is positive");
		}
	}

}
