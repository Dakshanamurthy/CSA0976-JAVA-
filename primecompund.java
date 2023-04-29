import java.io.*;
im[ort java.util.*;
class countprime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Scanner.out.print("Enter the number of element in array:");
		int a=s.nextInt();
		int d[]=new int[a];
		int i,c=0,p=0,j,b;
		for(i=0;i<a;i++)
		{
			system.out.print("Enter element"+i+":");
			d[i]=s.nextInt();
		}
		for(i=0;i<a;i++)	
		{	
		b=d[i];	
		for(j=2;j<b;j++)	 
		  {
		   if(b%j==0)c++;
		   else p++;
		   break;	
		  }
		}
		system.out.println("composite number:"+c);
		system.out.println("prime number:"+p);
	}
}	