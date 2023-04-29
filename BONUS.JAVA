import java.io.*;
import java.util.*;
class bonus
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int b=5;
	int c=10;
	int a2;
	System.out.print("enter the grade of the employee:");
	String a=sc.nextLine();
	System.out.print("enter the salary of the employee:");
	int a1=sc.nextInt();
	if(a=="A")
	{
		a2=a1/b;
	}
	System.out.println("bonous is"+a1);
	if(a=="B");
	{
		a2=a1/c;
	}
	System.out.println("bonous is"+a2);
	int t=a1+a2;
	System.out.println("salary is"+a2);
	System.out.println("total salary is"+t);
}
}