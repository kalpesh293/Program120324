package test;
import java.util.*;
class employeapplication
{
   int id;
   String name;
   int sal;
  
   
   void setid(int id)
   {
	   this.id=id;
   }
   int getid()
   {
	   return id;
   }
   
   void setname(String name)
   {
	   this.name=name;
   }
   String getname()
   {
	   return name;
   }
   
   void setsal(int sal)
   {
	   this.sal=sal;
   }
   int getsal()
   {
	   return sal;
   }
   
}

class companey
{
	employeapplication e;
   void set(employeapplication e)
   {
	   this.e=e;
	   
   }
   
   void show()
   {
	   System.out.printf("employe id is---->%d\n",e.getid());
	   System.out.printf("employe name is---->%s\n",e.getname());
	   System.out.printf("employe sal is---->%d\n",e.getsal());
   }
}


public class EmployeeApplication 
{
	public static void main(String[] args)
	{
        Scanner xyz=new Scanner(System.in);
		
		employeapplication emp=new employeapplication();
		
		System.out.printf("enter id name and sal\n");
		
		int id=xyz.nextInt();
		String name=xyz.next();
		int sal=xyz.nextInt();
		
		emp.setid(id);
		emp.setname(name);
		emp.setsal(sal);
		
		companey e1=new companey();
		e1.set(emp);
		e1.show();
		
		

	}
}
