package test;
import java.util.*;
class Repetative
{
	int a[];
	void SetValue(int a[])
	{
		this.a=a;
	}
	void FindRepetative()
	{
		System.out.println("Repetative numbers in array is\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				   System.out.println(+a[i]);
				}
			}
		}
	}
}
public class FindRepetativeApp
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
		int size=s.nextInt();
		int a[]=new int [size];
		System.out.println("Enter values in array");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		Repetative r=new Repetative();
		r.SetValue(a);
		r.FindRepetative();
	}
}
