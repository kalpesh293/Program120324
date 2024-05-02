package test;
import java.util.*;
public class LinkedHashSetApp
{
	public static void main(String[] args)
	{
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(100);
		hs.add(150);
		hs.add(10);
		hs.add(40);
		hs.add(134);
		hs.add(16);
		hs.add(88);
		hs.add(50);
		hs.add(10);
		hs.add(70);
		for(Object obj: hs)
		{
			System.out.println(obj);
		}
	}
}
