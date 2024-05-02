package test;

import java.util.*;
class employe
{
	int id;
	String name;
	String add;
	
	void set(int id,String name,String add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
	
	}
}
class freelancer extends employe
{
	void setfree(int hsal,int phcost)
	{
		int total_salary=hsal*phcost;
		System.out.printf("free lancer employee id is:%d\n",id);
		System.out.printf("free lancer employee name is:%s\n",name);
		System.out.printf("free lancer employee address is:%s\n",add);
		
		System.out.printf("total salary of freelancer employeee is:%d\n",total_salary);
		
	}
}

class permenantemployee extends employe
{
	void setpermentsal(int pakage)
	{
		int total_persalary=pakage/12;
		System.out.printf("perment employe id is:%d\n",id);
		System.out.printf("perment employee name is:%s\n",name);
		System.out.printf("perment employee address is:%s\n",add);
		System.out.printf("total salary of perment employeee is:%d\n",total_persalary);	
	}
}


public class EmployeeeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner xyz=new Scanner(System.in);
		  System.out.printf("enter freelancer employee id\n");
		  int id=xyz.nextInt();
		  System.out.printf("enter the freelancer employee name\n");
		  String name=xyz.next();
		  System.out.printf("enter the freelancer employe address\n");
		  String add=xyz.next();
		  System.out.printf("enter the permenant employee id\n");
		  int pid=xyz.nextInt();
		  System.out.printf("enter the  permenant employee name\n");
		  String pname=xyz.next();
		  System.out.printf("enter the perment employee address\n");
		  String padd=xyz.next();
		  System.out.printf("enter the freelancer employee hours\n");
		  int shour=xyz.nextInt();
		  System.out.printf("enter the freelancer employee per houre cost\n");  
		  int phcost=xyz.nextInt();  
		  System.out.printf("enter the permenant employee package\n");
		  int pakage=xyz.nextInt();  
		  freelancer f=new freelancer(); 
		  f.set(id, name, add);
		  f.setfree(shour, phcost);
		  permenantemployee p=new permenantemployee();
		  p.set(pid, pname, padd);
		  p.setpermentsal(pakage);
	}
}

