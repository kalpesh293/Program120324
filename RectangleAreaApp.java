package test;
import java.util.*;

class Rectangle
{
	int len,wid;
	void SetValues(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	void calArea()
	{
		System.out.println("Area of rectangle is \n"+len*wid);
	}
}
public class RectangleAreaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		int len=xyz.nextInt();
		int wid=xyz.nextInt();
		Rectangle r=new Rectangle();
		r.SetValues(len, wid);
		r.calArea();
		

	}

}
