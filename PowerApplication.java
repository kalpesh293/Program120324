package test;
public class PowerApplication {

	public static void main(String[]x) {
		// TODO Auto-generated method stub
		int base,index,power=1;
		//System.out.println("Enter base and index");
		base=Integer.parseInt(x[1]);
		index=Integer.parseInt(x[2]);
		for(int i=0;i<=index;i++)
		{
			power=power*base;
		}
		System.out.printf("Power is %d\n",power);
		

	}

}
