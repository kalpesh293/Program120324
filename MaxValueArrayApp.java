package test;
import java.util.*;

public class MaxValueArrayApp {

	public static void main(String[] args) {
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
		int max=a[0];
        for(int i=0;i<size;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        	}
        }
        System.out.println("Largest value in Array\n"+max);
	}

}
