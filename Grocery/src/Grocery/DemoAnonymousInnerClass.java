package Grocery;

public class DemoAnonymousInnerClass {
	public static void main(String[] args) {
		PClass obj=new PClass()
		{
			public void m1(int x)
			{
				System.out.println("m1()");
				System.out.println("x value "+x);
			}
			@SuppressWarnings("unused")
			public void m3(int y)
			{
				System.out.println("m3()");
				System.out.println("y value "+y);
			}

		};
			obj.m1(12);	
			obj.m2(25);
	}

}
