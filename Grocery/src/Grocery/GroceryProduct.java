package Grocery;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryProduct {
	static int Shampoo;
	static int Soap;
	static int Detergent_Powder;
	static int Perfume;
	static int Colgate;
	static int Teeth_Brush;
	static int Hair_Oil;
	static int Comb;
	static int Body_Lotion;
	static int Cloth_Soap;
	static int quantity;
	String s;
	
	public void getProduct()
	{
		GroceryProduct p=new GroceryProduct();
		Scanner sc=new Scanner(System.in);
		try
		{
			 
		System.out.println("\tPlease select which Product You want ");
		System.out.println("------------------------------------------------------------");
		System.out.println("Enter 1 for Shampoo, Price 78");
		System.out.println("Enter 2 for Soap, Price 36 ");
		System.out.println("Enter 3 for Detergent poweder, Price 56");
		System.out.println("Enter 4 for Perfume, Price 250 ");
		System.out.println("Enter 5 for Colgate, Price 40");
		System.out.println("Enter 6 for Teeth Brush, Price 50");
		System.out.println("Enter 7 for Hair Oil, Price 90");
		System.out.println("Enter 8 for Comb, Price 20");
		System.out.println("Enter 9 for Body Lotion, Price 150");
		System.out.println("Enter 10 for Cloth soap, Price 20");
		
		int n=sc.nextInt();
		if(n>10)
		
		{
			System.out.println("PLEASE SELECT BETWEEN 1 TO 10 ");
			p.getProduct();
		}
		else
		{
		switch(n)
		{
		case 1 : System.out.println("You are selected Shampoo");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Shampoo=quantity*78;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 2 : System.out.println("You are selected Soap");
		System.out.println("How much quantity ");
		quantity=sc.nextInt();
		Soap=quantity*36;
		
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
	
		if(s.equalsIgnoreCase("Y"))
			p.getProduct();
		else
		{
			p.getPrice();
		}
			break;
		case 3 : System.out.println("You are selelcted Detergent Powder");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Detergent_Powder=quantity*56;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 4 : System.out.println("You are selected Perfume");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Perfume=quantity*250;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 5 : System.out.println("You are selected Colgate");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Colgate=quantity*40;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 6 : System.out.println("You are selected Teeth Brush");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Teeth_Brush=quantity*50;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 7 : System.out.println("You are selected Hair Oil");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Hair_Oil=quantity*90;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 8 : System.out.println("You are selected Comb");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Comb=quantity*20;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 9 : System.out.println("You are selected Body Lotion ");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		Body_Lotion=quantity*150;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;
		case 10 : System.out.println("You are selected Cloth soap ");
		System.out.println("How much quantity ");
		 quantity=sc.nextInt();
		 Cloth_Soap=quantity*20;
		System.out.println("Do you want to continue for Shoping ");
		System.out.println("Y/N");
		 s=sc.next();
		if(s.equalsIgnoreCase("Y"))
		{
			p.getProduct();
		}
		else
		{
		p.getPrice();
		}
			break;	
		}
		}
		
	}//try clock
		catch (InputMismatchException e)
		{
			System.out.println("Please input Numeric key");
			p.getProduct();
		}
		finally
		{
			sc.close();
		}
	}
	void getPrice()
	{
		System.out.println("========================================");
		if(Shampoo>=1)
		{
			System.out.println("Product : Shampoo  Qnty : "+quantity+" Total : "+Shampoo);
		}
		if(Soap>=1)
		{
			System.out.println("Product : Soap  Qnty : "+quantity+" Total : "+Soap);
		}
		if(Detergent_Powder>=1)
		{
			System.out.println("Product : Detergent Powder  Qnty : "+quantity+" Total : "+Detergent_Powder);
		}
		if(Perfume>=1)
		{
			System.out.println("Product : Perfume  Qnty : "+quantity+" Total : "+Perfume);
		}
		if(Colgate>=1)
		{
			System.out.println("Product : Colgate  Qnty : "+quantity+" Total : "+Colgate);
		}
		if(Teeth_Brush>=1)
		{
			System.out.println("Product : Teeth_Brush  Qnty : "+quantity+" Total : "+Teeth_Brush);
		}
		if(Hair_Oil>=1)
		{
			System.out.println("Product : Hair_Oil  Qnty : "+quantity+" Total : "+Hair_Oil);
		}
		if(Comb>=1)
		{
			System.out.println("Product : Comb  Qnty : "+quantity+" Total : "+Comb);
		}
		if(Body_Lotion>=1)
		{
			System.out.println("Product : Body_Lotion  Qnty : "+quantity+" Total : "+Body_Lotion);
		}
		if(Cloth_Soap>=1)
		{
			System.out.println("Product : Cloth_Soap  Qnty : "+quantity+" Total : "+Cloth_Soap);
		}
		int Amount=Shampoo+Soap+Detergent_Powder+Perfume+Colgate+Teeth_Brush+Comb+Body_Lotion+Cloth_Soap;
		if(Amount>=1500)
		{
			double Total=Amount-Amount*0.1;
			System.out.println("You got "+Amount*0.1+" Discount");
			System.out.println("Total Price : "+Total);
			System.out.println("ThankYou for Shoping ");
			System.out.println("===============VISIT AGAIN===============");
		}
		else
		{
		System.out.println("Total Price : "+Amount);
		System.out.println("ThankYou for Shoping ");
		System.out.println("================VISIT AGAIN================");
		}
	}

}
