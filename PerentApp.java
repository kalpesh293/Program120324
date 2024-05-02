package test;
import java.util.*;
class perent
{
	perent(int a)
	{
		System.out.printf("a is---->%d\n",a);
	}
}
class child extends perent
{
	child(int b)
	{
		super(10);
		System.out.printf("b is ---->%d",b);
	}
}
public class PerentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        child c=new child(100);
	}

}
