package test;
import java.util.*;
class CheckIsogram
{
	String x;
	void AcceptString(String x)
	{
		this.x=x;
	}
	void CheckIsogram()
	{
		boolean flag=true;
		int len=x.length();
		char a[]=x.toCharArray();
		for(int i=0;i<len-1;i++)
		{
			if(a[i]==a[i+1])
			{
				flag=false;
				break;
			}	
		}
		if(flag)
		{
			System.out.println("the String is  isogram");
		}
		else
		{
			System.out.println("The String is not isogram");
		}
	}
}
public class CheckIsogramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner xyz=new Scanner(System.in);
        System.out.println("Enter the String\n");
        String x=xyz.nextLine();
        CheckIsogram ci=new CheckIsogram();
        ci.AcceptString(x);
        ci.CheckIsogram();
        
	}

}
