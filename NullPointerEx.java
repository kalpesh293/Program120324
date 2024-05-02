package test;
class Test
{
	void show()
	{
		System.out.println("logic 1");
	}
}

public class NullPointerEx {
	 static Test a;
	public static void main(String[] args)
	{
				
		try
	   {
		    a.show();
		}
		catch(Exception ex)
		{
			System.out.println("Exeption is"+ex);
		}	


	}

}
