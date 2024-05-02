package test;
import java.util.*;
public class JaggedArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][];
		a[0]=new int[] {1,2,3};
		a[1]=new int[] {4,5};
		a[2]=new int[] {7,8,9,19};
		System.out.println("Array is\n");
		for(int i=0;i<a[i].length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"");
				
			}
			System.out.println();
		}
	}
}
