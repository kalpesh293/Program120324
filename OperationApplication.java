package test;
import java.util.*;
class Operation
{    
	int squre;
	float squree;
	String str;
	void SetValue(int squre)
	{
		this.squre=squre;
		System.out.println("Squre of integer value is\n "+squre*squre);
	}
	void SetValue(float squree)
	{
		this.squree=squree;
		System.out.println("Squre of float value is\n "+squree*squree);
	}
	void SetValue(String str)
	{
		 this.str=str;
		 int i,name;
	     char ch[]=str.toCharArray();
	     System.out.println("String in upper case is");
	     for( i=0;i<ch.length;i++)
	     {
		     if (ch[i]>='a'&& ch[i]<='z')
		     { 
		    	 name=((int)ch[i]-32);
		         System.out.printf("%c",name);	 
		     }
		     else
		     {
		    	 System.out.printf("%c",ch[i]);
	         }		
	     }
     }
}
public class OperationApplication
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter integer value to get squre");
		int squre=xyz.nextInt();
		Operation o=new Operation();
		o.SetValue(squre);
		System.out.println("Enter float value to get squre");
		float squree=xyz.nextFloat();
		o.SetValue(squree);
		System.out.println("Enter string to convert Upper");
		xyz.nextLine();
		String str=xyz.nextLine();
		o.SetValue(str);
	}
}
