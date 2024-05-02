package test;
import java.util.*;
class per
{
	int s[];
	void calper(int s[])
	{
		this.s=s;
		
	}
	
}

class nine extends per
{
	int agg,per;
	void calper(int s[])
	{
		for(int i=0;i<s.length;i++)
		{
			agg=agg+s[i];			
		}
		per=agg/6;
		
		System.out.printf("nine student percentage is--->%d\n",per);
	}
}

class ten extends per
{
	int agg,per;
	
	
   void calper(int a[])
     {
    	for(int i=0;i<a.length;i++)
    	{
    		int temp;
    		for(int j=0;j<a.length;j++)
    		{
    			if(a[i]>a[j])
    			{
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}
    	 
    	 for(int j=0;j<5;j++)
    	 {
    		 agg=agg+a[j];
    	 }
    	 per=agg/5;
        
    	 System.out.printf("ten studnet per is---->%d\n",per);
     }
     
   
	
}
public class PerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
   	 int s[]=new int[6];
   	 
   	 System.out.printf("enter the 6 sub marks\n");
   	 for(int i=0;i<s.length;i++)
   	 {
   		 s[i]=xyz.nextInt();
   	 }
   	 
         int a[]=new int[6];
   	 
   	 System.out.printf("enter the 6 sub marks\n");
   	 for(int i=0;i<a.length;i++)
   	 {
   		 a[i]=xyz.nextInt();
   	 }
   	 nine n=new nine();
  	     n.calper(s);
  	     
  	     ten t=new ten();
  	     t.calper(a);
   	 
	}

}
