package test;
import java.util.*;
public class VectorMaxApp {

	public static void main(String[] args)
	{
		int i;
		   Vector<Integer> v=new Vector<Integer>();	
		   v.add(100);
		   v.add(40);
		   v.add(10);
		   v.add(55);
		   v.add(122);
		   v.add(145);
		   v.add(14);
		   v.add(80);
		   v.add(50);
		   v.add(52);
		  
		   System.out.println("Maximum number of vector is");
		   int max=0;
		   for(i=0;i<v.size();i++)
		   {
			   int a=v.get(i);
			   if(max<v.get(i))
			   {
				   max=a;
			   }
			  
		   }
		   System.out.println(+max);
	}

}
