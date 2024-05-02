package test;
import java.util.*;
interface StringInterface
{
    void acceptString(String str);
    void sortString();
}
class SortString implements StringInterface
{
     String str;
     char a[];
     public void acceptString(String str)
     {
        this.str=str;
        System.out.println("The Given String is : "+str);
        a=str.toCharArray();
     }
     public void sortString()
     {
       for(int i=0;i<a.length;i++)
       {
          for(int j=i+1;j<a.length;j++)
          {
             if(a[i]>a[j])
             {
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
             }
          }
       }
       System.out.println("String After Sorting");
       for(int i=0;i<a.length;i++)
       {
          System.out.printf("%c",a[i]);
       }
     }
}

public class StringInterfaceApp
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		SortString ss=new SortString();
		ss.acceptString(str);
		ss.sortString();
	}
}
