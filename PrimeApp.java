//Program to find all prime numbers between 1 to 1000.
package kk.Exception.org;
import java.util.*;

public class PrimeApp 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
	    int no = 1;
	    String  prime = " ";
	    System.out.println("Enter the value ");
	    int n = xyz.nextInt();
	      
	    for (int i = 1; i <= n; i++)  	   
	    { 		 		  
           int temp=0; 		  
           for(no =i; no>=1; no--)
           {
	          if(i%no==0)
	          {
		          temp = temp + 1;
	          }
	       }
	       if (temp == 2)
	       {
	           prime = prime + i + " ";
	       }	
	    }	
	    System.out.println("Prime numbers from 1 to" + n + "are :");
	    System.out.println(prime);

	}

}
