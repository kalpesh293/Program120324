package test;
import java.util.*;
abstract class StringParent
{
	abstract void acceptString(String str);
}
  class ConvertToUpper extends StringParent
  {
	  void acceptString(String str)
	  {
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
public class StringParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      String str=sc.next();
      ConvertToUpper c=new ConvertToUpper();
      c.acceptString(str);
	}

}

