package main.java;

public class ClassA implements IntA {

	//@Override
	public Integer Add(Integer X , Integer Y)
	{
		System.out.println((X*X)+(Y*Y));
		return X+Y;
	}
	
	public static void main (String args[])
	{
		ClassA A=new ClassA();
		A.Add(3, 4);
		ClassA B = ClassA::new;
		//A::Diff(4, 3);
	}
	
	//@Override
	public Integer Diff(Integer X , Integer Y)
	{
		System.out.println("No data To return");
		return 0;
	}
}
