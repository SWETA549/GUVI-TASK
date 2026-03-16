package task1;
import java.util.Scanner;
public class Java13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to be rev:");
		int n= scan.nextInt();
		
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println("The reversed number is:"+ rev);
	}

}
