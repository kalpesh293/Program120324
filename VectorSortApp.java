package test;

import java.util.*;

public class VectorSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Vector <Integer> v=new Vector <Integer>();
		System.out.println("enter the 10 element");
		for(int i=0;i<10;i++)
		{
			int no=sc.nextInt();
			v.add(no);
		}
		int n=Collections.sort(v);
		System.out.println("minmum element :"+n);

	}

}
