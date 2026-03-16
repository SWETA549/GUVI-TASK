package task1;
import java.util.Scanner;
public class Java14 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers:");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	if(n1>n2 && n1>n3)
	{
		System.out.println("The great is:"+ n1);
		
	}
	
	else if(n2>n1 && n2>n3) 
	{
		System.out.println("The great is:" +n2);
	}
	else {
		System.out.println("The great is:" +n3);
	}
}
}
