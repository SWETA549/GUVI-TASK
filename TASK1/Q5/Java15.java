package task1;
import java.util.Scanner;
public class Java15 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<500)
		{
			System.out.println("No discount");
		}
		else if( n>500 && n<=1000) {
			int d=(int)(n*0.1);
			n=n-d;
			System.out.println("The price is:"+n);
		}
		else if(n>1000) {
			int d=(int)(n*0.2);
			n=n-d;
			System.out.println("The price is:"+n);
		}
	}
}
