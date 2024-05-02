package test;
import java.util.*;
public class MatrixApp
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int [3][3];
		int i,j,sum=0,sum1=0,sum2=0;
		System.out.println("Enter values in array\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		System.out.printf("%d\t",a[i][j]);
        	}
        	System.out.println("\n");
        }
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		if(i==0)
        		{
        			sum=sum+a[i][j];
        		}
        	}
        }
        System.out.printf("%d",sum);
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		if(i==1)
        		{
        			sum1=sum1+a[i][j];
        		}
        	}
        }
        System.out.printf("\t%d",sum1);
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		if(i==2)
        		{
        			sum2=sum2+a[i][j];
        		}
        	}
        }
        System.out.printf("\t%d",sum2);
	}

}
